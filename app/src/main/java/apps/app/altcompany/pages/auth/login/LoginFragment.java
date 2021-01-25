package apps.app.altcompany.pages.auth.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentLoginBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.confirmCode.ConfirmCodeFragment;
import apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordFragment;
import apps.app.altcompany.pages.auth.models.SocialRequest;
import apps.app.altcompany.pages.auth.models.UsersResponse;
import apps.app.altcompany.pages.auth.register.RegisterFragment;
import apps.app.altcompany.pages.auth.register.RegisterStep2Fragment;
import apps.app.altcompany.pages.auth.register.RegisterStep3Fragment;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.session.UserHelper;

import static apps.app.altcompany.utils.Constants.RC_SIGN_IN;

public class LoginFragment extends BaseFragment {
    private Context context;
    @Inject
    LoginViewModel viewModel;
    private FragmentLoginBinding binding;
    private GoogleSignInClient mGoogleSignInClient;
    private CallbackManager mCallbackManager;
    private FirebaseAuth mAuth;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setLoginViewModel(viewModel);
        mAuth = FirebaseAuth.getInstance();
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(context, gso);
        mCallbackManager = CallbackManager.Factory.create();
        signInFacebook();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.REGISTER:
                    MovementHelper.startActivity(context, RegisterStep2Fragment.class.getName(), getString(R.string.register), null);
                    break;
                case Constants.LOGIN:
//                    if (((UsersResponse) mutable.object).getData().getPaymentStatus() == 0 && ((UsersResponse) mutable.object).getData().getType() != 0) {
//                        showError(((UsersResponse) mutable.object).mMessage);
//                        UserHelper.getInstance(context).addJwt(((UsersResponse) ((Mutable) o).object).getData().getJwt());
//                    } else {
//                        toastMessage(((UsersResponse) mutable.object).mMessage);
//                        UserHelper.getInstance(context).userLogin(((UsersResponse) ((Mutable) o).object).getData());
//                        MovementHelper.startActivityMain(context);
//                    }
                    break;
                case Constants.FORGET_PASSWORD:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.FORGET_PASSWORD), null, ForgetPasswordFragment.class.getName(), null);
                    break;
                case Constants.NOT_VERIFIED:
                    MovementHelper.startActivity(context, ConfirmCodeFragment.class.getName(), null, null);
                    break;
                case Constants.EMPTY_WARNING:
                    showError(getResources().getString(R.string.this_field_is_requried));
                    break;
                case Constants.GOOGLE:
                    signInGoogle();
                    break;
                case Constants.FACEBOOK:
//                    binding.btnFacebook.performClick();
                    break;

            }
        });
    }

    private void signInFacebook() {
        LoginManager.getInstance().registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.e(TAG, "onSuccess: " + loginResult.getAccessToken());
                handleFacebookAccessToken(loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });
    }

    private void handleFacebookAccessToken(AccessToken accessToken) {
        Log.d(TAG, "handleFacebookAccessToken:" + accessToken);
        handleActions(new Mutable(Constants.SHOW_PROGRESS));
        AuthCredential credential = FacebookAuthProvider.getCredential(accessToken.getToken());
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        handleActions(new Mutable(Constants.HIDE_PROGRESS));
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            Log.e(TAG, "onComplete: " + user.getPhoneNumber());
                        } else
                            Log.e(TAG, "onComplete: " + task.getException());
                    }
                });
    }

    private void signInGoogle() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);

    }

    @Override
    public void onResume() {
        super.onResume();
        mAuth.signOut();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private static final String TAG = "LoginFragment";

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        mCallbackManager.onActivityResult(requestCode, resultCode, data);//facebook
        super.onActivityResult(requestCode, resultCode, data);
        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                if (account != null) {
                    viewModel.socialLogin(new SocialRequest(account.getDisplayName(), account.getPhotoUrl().toString(), UserHelper.getInstance(context).getToken(), account.getId()));
                }
            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
    }
}
