package apps.app.altcompany.utils.locations;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.base.ParentActivity;
import apps.app.altcompany.databinding.ActivityMapAddressBinding;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.session.LanguagesHelper;
import apps.app.altcompany.utils.session.MyContextWrapper;

public class MapAddressActivity extends FragmentActivity implements
        LocationListener {

    public double lat = 0, lng = 0;
    @Inject
    MapAddressViewModel mapAddressViewModel = null;
    ActivityMapAddressBinding activityMapAddressBinding;
    MapView mapView;
    boolean async = false;
    FusedLocationProviderClient fusedLocationProviderClient = null;
    private static final int LOCATION_REQUEST = 500;
    private static final int MY_PERMISSIONS_REQUEST_CODE = 7000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            mapAddressViewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        activityMapAddressBinding = DataBindingUtil.setContentView(this, R.layout.activity_map_address);
        mapView = activityMapAddressBinding.mapView;
        activityMapAddressBinding.setMapAddressViewModel(mapAddressViewModel);
        if (LanguagesHelper.getCurrentLanguage().equals("ar"))
            activityMapAddressBinding.imgMapSubmit.setRotation(180);
        initViews();
        onMapReady();
        setClickEvent();
    }

    private void setClickEvent() {
        mapAddressViewModel.getLiveData().observe(this, o -> {
            double lat = mapAddressViewModel.mMap.getCameraPosition().target.latitude;
            double lng = mapAddressViewModel.mMap.getCameraPosition().target.longitude;

            MapConfig.getAddress(lat, lng, this, (address, city) -> {
                if (!TextUtils.isEmpty(address)) {
                    activityMapAddressBinding.mapProgress.setVisibility(View.VISIBLE);
                    Intent intent = new Intent();
                    intent.putExtra(Constants.LAT, lat);
                    intent.putExtra(Constants.LNG, lng);
                    intent.putExtra(Constants.ADDRESS, address);
                    setResult(Activity.RESULT_OK, intent);
                    finish();
                } else {
                    activityMapAddressBinding.mapProgress.setVisibility(View.GONE);
                    ((ParentActivity) getApplicationContext()).showError(getResources().getString(R.string.location_warning));
                }
            });

        });
    }

    private void onMapReady() {
        activityMapAddressBinding.mapView.getMapAsync(googleMap -> {
            mapAddressViewModel.mMap = googleMap;
            MapConfig mapConfig = new MapConfig(MapAddressActivity.this, mapAddressViewModel.mMap);
            mapConfig.setSettings();
            activityMapAddressBinding.imgMarkerCenter.setVisibility(View.VISIBLE);
            if (lat != 0 && lng != 0) {
                LatLng offerLocation = new LatLng(lat, lng);
                googleMap.addMarker(new MarkerOptions().position(offerLocation)
                        .title(getString(R.string.address)));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(offerLocation, 15));
                googleMap.animateCamera(CameraUpdateFactory.zoomIn());
                // Zoom out to zoom level 10, animating with a duration of 2 seconds.
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
                activityMapAddressBinding.imgMarkerCenter.setVisibility(View.GONE);
            }
            enableMyLocationIfPermitted();
        });
    }

    private void enableMyLocationIfPermitted() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION},
                    LOCATION_REQUEST);
        } else if (mapAddressViewModel.mMap != null) {
            mapAddressViewModel.mMap.setMyLocationEnabled(true);
            startUpdateLocation();
            onResume();
        }
    }

    private void initViews() {
        activityMapAddressBinding.mapView.onCreate(null);
        activityMapAddressBinding.mapView.onResume();
        onMapReady();
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        setUpLocation();
    }

    private void setUpLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //Request RunTime Permission
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION,
            }, MY_PERMISSIONS_REQUEST_CODE);

        }
    }

    private void startUpdateLocation() {
        LocationManager mLocationManager = (LocationManager) getApplicationContext().getSystemService(LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        if (mapAddressViewModel.getPassingObject() == null) {
            List<String> providers = mLocationManager.getProviders(true);
            Location bestLocation = null;
            for (String provider : providers) {
                Location l = mLocationManager.getLastKnownLocation(provider);
                if (l == null) {
                    continue;
                }
                if (bestLocation == null || l.getAccuracy() < bestLocation.getAccuracy()) {
                    // Found best last known location: %s", l);
                    bestLocation = l;
                    mapAddressViewModel.mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(bestLocation.getLatitude(), bestLocation.getLongitude()), 17.0f));
                }
            }
        } else {
            mapAddressViewModel.mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(mapAddressViewModel.getPassingObject().getObject()), Double.parseDouble(mapAddressViewModel.getPassingObject().getObject2())), 17.0f));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (async) {
            onMapReady();
            async = false;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapAddressViewModel.reset();
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @SuppressLint("MissingPermission")
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == LOCATION_REQUEST && grantResults.length > 0) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {

            } else {
                runtime_permissions();
            }
        }
    }

    private static final int ACCESS_CODE = 102;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1000) {
            if (resultCode == Activity.RESULT_OK) {
                final String action = Settings.ACTION_LOCATION_SOURCE_SETTINGS;
                startActivityForResult(new Intent(action), ACCESS_CODE);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    protected boolean runtime_permissions() {
        if (Build.VERSION.SDK_INT >= 23 &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION}, LOCATION_REQUEST);
            return true;
        }
        return false;
    }

    @Override
    public void onLocationChanged(Location location) {
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1) {
            super.attachBaseContext(MyContextWrapper.wrap(newBase, LanguagesHelper.getCurrentLanguage()));
        } else {
            super.attachBaseContext(newBase);
        }
    }
}
