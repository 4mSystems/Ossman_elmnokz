package apps.app.altcompany.utils.locations;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.Place;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.utils.Constants;


public class MapAddressViewModel extends BaseViewModel {
    public ObservableField<LatLng> mMapLatLng;
    public static ObservableField<Double> latitude;
    public static ObservableField<Double> longitude;
    public static ObservableField<String> address;
    public static ObservableField<String> arabicAddress;
    public ObservableField<String> placeSelectedObservable;

    public static double lat = 0,lng = 0;
    public GoogleMap mMap;
    public void submit(){
        getLiveData().setValue(Constants.PICKED_SUCCESSFULLY);
    }

    @Inject
    public MapAddressViewModel() {
        latitude = new ObservableField<>();
        longitude = new ObservableField<>();
        address = new ObservableField<>();
        placeSelectedObservable = new ObservableField<>();
        arabicAddress = new ObservableField<>();
    }

    @BindingAdapter("initMap")
    public static void initMap(final MapView mapView, final LatLng latLng) {
//        if (mapView != null) {
//            mapView.onCreate(new Bundle());
//            mapView.getMapAsync(new OnMapReadyCallback() {
//                @Override
//                public void onMapReady(final GoogleMap googleMap) {
//                }
//            });
//        }
    }

    public void confirm(){

    }

    public void reset() {
//        mMapLatLng.set(null);
        latitude.set(null);
        longitude.set(null);
        address.set(null);
    }

    public void moveToPlace(Place place) {
        placeSelectedObservable.set(place.getAddress().toString());
        if(mMap != null)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(place.getLatLng(), 15.0f));

    }

}