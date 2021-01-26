package apps.app.altcompany;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import apps.app.altcompany.databinding.ActivityBaseBindingImpl;
import apps.app.altcompany.databinding.ActivityMainBindingImpl;
import apps.app.altcompany.databinding.ActivityMapAddressBindingImpl;
import apps.app.altcompany.databinding.FragmentAboutBindingImpl;
import apps.app.altcompany.databinding.FragmentChangePasswordBindingImpl;
import apps.app.altcompany.databinding.FragmentCompanyProfileBindingImpl;
import apps.app.altcompany.databinding.FragmentConfirmCodeBindingImpl;
import apps.app.altcompany.databinding.FragmentForgetPasswordBindingImpl;
import apps.app.altcompany.databinding.FragmentHomeBindingImpl;
import apps.app.altcompany.databinding.FragmentLoginBindingImpl;
import apps.app.altcompany.databinding.FragmentOrderDetailBindingImpl;
import apps.app.altcompany.databinding.FragmentPrivacyBindingImpl;
import apps.app.altcompany.databinding.FragmentRegisterStep1BindingImpl;
import apps.app.altcompany.databinding.FragmentRegisterStep2BindingImpl;
import apps.app.altcompany.databinding.FragmentRegisterStep3BindingImpl;
import apps.app.altcompany.databinding.FragmentRegisterStep4BindingImpl;
import apps.app.altcompany.databinding.FragmentSplashBindingImpl;
import apps.app.altcompany.databinding.FragmentSuggestionBindingImpl;
import apps.app.altcompany.databinding.FragmentUserDetailsBindingImpl;
import apps.app.altcompany.databinding.ItemCategoryBindingImpl;
import apps.app.altcompany.databinding.ItemMenuBindingImpl;
import apps.app.altcompany.databinding.ItemOrderBindingImpl;
import apps.app.altcompany.databinding.ItemRechargeBindingImpl;
import apps.app.altcompany.databinding.LayoutActionBarBackBindingImpl;
import apps.app.altcompany.databinding.LayoutActionBarHomeBindingImpl;
import apps.app.altcompany.databinding.LayoutGrandBindingImpl;
import apps.app.altcompany.databinding.LayoutNavigationDrawerBindingImpl;
import apps.app.altcompany.databinding.TermsDialogBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYMAPADDRESS = 3;

  private static final int LAYOUT_FRAGMENTABOUT = 4;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 5;

  private static final int LAYOUT_FRAGMENTCOMPANYPROFILE = 6;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 7;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 8;

  private static final int LAYOUT_FRAGMENTHOME = 9;

  private static final int LAYOUT_FRAGMENTLOGIN = 10;

  private static final int LAYOUT_FRAGMENTORDERDETAIL = 11;

  private static final int LAYOUT_FRAGMENTPRIVACY = 12;

  private static final int LAYOUT_FRAGMENTREGISTERSTEP1 = 13;

  private static final int LAYOUT_FRAGMENTREGISTERSTEP2 = 14;

  private static final int LAYOUT_FRAGMENTREGISTERSTEP3 = 15;

  private static final int LAYOUT_FRAGMENTREGISTERSTEP4 = 16;

  private static final int LAYOUT_FRAGMENTSPLASH = 17;

  private static final int LAYOUT_FRAGMENTSUGGESTION = 18;

  private static final int LAYOUT_FRAGMENTUSERDETAILS = 19;

  private static final int LAYOUT_ITEMCATEGORY = 20;

  private static final int LAYOUT_ITEMMENU = 21;

  private static final int LAYOUT_ITEMORDER = 22;

  private static final int LAYOUT_ITEMRECHARGE = 23;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 24;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 25;

  private static final int LAYOUT_LAYOUTGRAND = 26;

  private static final int LAYOUT_LAYOUTNAVIGATIONDRAWER = 27;

  private static final int LAYOUT_TERMSDIALOG = 28;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(28);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.activity_map_address, LAYOUT_ACTIVITYMAPADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_company_profile, LAYOUT_FRAGMENTCOMPANYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_order_detail, LAYOUT_FRAGMENTORDERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_privacy, LAYOUT_FRAGMENTPRIVACY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_register_step1, LAYOUT_FRAGMENTREGISTERSTEP1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_register_step2, LAYOUT_FRAGMENTREGISTERSTEP2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_register_step3, LAYOUT_FRAGMENTREGISTERSTEP3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_register_step4, LAYOUT_FRAGMENTREGISTERSTEP4);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_suggestion, LAYOUT_FRAGMENTSUGGESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.fragment_user_details, LAYOUT_FRAGMENTUSERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.item_menu, LAYOUT_ITEMMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.item_order, LAYOUT_ITEMORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.item_recharge, LAYOUT_ITEMRECHARGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.layout_grand, LAYOUT_LAYOUTGRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.layout_navigation_drawer, LAYOUT_LAYOUTNAVIGATIONDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(apps.app.altcompany.R.layout.terms_dialog, LAYOUT_TERMSDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBASE: {
          if ("layout/activity_base_0".equals(tag)) {
            return new ActivityBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAPADDRESS: {
          if ("layout/activity_map_address_0".equals(tag)) {
            return new ActivityMapAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_map_address is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
          if ("layout/fragment_change_password_0".equals(tag)) {
            return new FragmentChangePasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOMPANYPROFILE: {
          if ("layout/fragment_company_profile_0".equals(tag)) {
            return new FragmentCompanyProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_company_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONFIRMCODE: {
          if ("layout/fragment_confirm_code_0".equals(tag)) {
            return new FragmentConfirmCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_confirm_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORGETPASSWORD: {
          if ("layout/fragment_forget_password_0".equals(tag)) {
            return new FragmentForgetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERDETAIL: {
          if ("layout/fragment_order_detail_0".equals(tag)) {
            return new FragmentOrderDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_order_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRIVACY: {
          if ("layout/fragment_privacy_0".equals(tag)) {
            return new FragmentPrivacyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_privacy is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERSTEP1: {
          if ("layout/fragment_register_step1_0".equals(tag)) {
            return new FragmentRegisterStep1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_step1 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERSTEP2: {
          if ("layout/fragment_register_step2_0".equals(tag)) {
            return new FragmentRegisterStep2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_step2 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERSTEP3: {
          if ("layout/fragment_register_step3_0".equals(tag)) {
            return new FragmentRegisterStep3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_step3 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERSTEP4: {
          if ("layout/fragment_register_step4_0".equals(tag)) {
            return new FragmentRegisterStep4BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_step4 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUGGESTION: {
          if ("layout/fragment_suggestion_0".equals(tag)) {
            return new FragmentSuggestionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_suggestion is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERDETAILS: {
          if ("layout/fragment_user_details_0".equals(tag)) {
            return new FragmentUserDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY: {
          if ("layout/item_category_0".equals(tag)) {
            return new ItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMENU: {
          if ("layout/item_menu_0".equals(tag)) {
            return new ItemMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMORDER: {
          if ("layout/item_order_0".equals(tag)) {
            return new ItemOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_order is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECHARGE: {
          if ("layout/item_recharge_0".equals(tag)) {
            return new ItemRechargeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recharge is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTACTIONBARBACK: {
          if ("layout/layout_action_bar_back_0".equals(tag)) {
            return new LayoutActionBarBackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_action_bar_back is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTACTIONBARHOME: {
          if ("layout/layout_action_bar_home_0".equals(tag)) {
            return new LayoutActionBarHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_action_bar_home is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTGRAND: {
          if ("layout/layout_grand_0".equals(tag)) {
            return new LayoutGrandBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_grand is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTNAVIGATIONDRAWER: {
          if ("layout/layout_navigation_drawer_0".equals(tag)) {
            return new LayoutNavigationDrawerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_navigation_drawer is invalid. Received: " + tag);
        }
        case  LAYOUT_TERMSDIALOG: {
          if ("layout/terms_dialog_0".equals(tag)) {
            return new TermsDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for terms_dialog is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(33);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutViewModel");
      sKeys.put(2, "baseViewModel");
      sKeys.put(3, "categoriesAdapter");
      sKeys.put(4, "categoryData");
      sKeys.put(5, "changePasswordViewModel");
      sKeys.put(6, "checked");
      sKeys.put(7, "citiesList");
      sKeys.put(8, "companyProfile");
      sKeys.put(9, "departmentsItems");
      sKeys.put(10, "forgetPasswordViewModel");
      sKeys.put(11, "homeData");
      sKeys.put(12, "homeViewModel");
      sKeys.put(13, "itemHomeViewModel");
      sKeys.put(14, "itemMenuViewModel");
      sKeys.put(15, "itemViewModel");
      sKeys.put(16, "loginViewModel");
      sKeys.put(17, "mapAddressViewModel");
      sKeys.put(18, "menuModel");
      sKeys.put(19, "menuViewModel");
      sKeys.put(20, "ordersAdapter");
      sKeys.put(21, "ordersData");
      sKeys.put(22, "packagesAdapter");
      sKeys.put(23, "packagesData");
      sKeys.put(24, "passingObject");
      sKeys.put(25, "privacyData");
      sKeys.put(26, "privacyViewModel");
      sKeys.put(27, "registerStep1ViewModel");
      sKeys.put(28, "sliderAdapter");
      sKeys.put(29, "splashViewModel");
      sKeys.put(30, "suggestionViewModel");
      sKeys.put(31, "verificationCodeViewModel");
      sKeys.put(32, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(28);

    static {
      sKeys.put("layout/activity_base_0", apps.app.altcompany.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", apps.app.altcompany.R.layout.activity_main);
      sKeys.put("layout/activity_map_address_0", apps.app.altcompany.R.layout.activity_map_address);
      sKeys.put("layout/fragment_about_0", apps.app.altcompany.R.layout.fragment_about);
      sKeys.put("layout/fragment_change_password_0", apps.app.altcompany.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_company_profile_0", apps.app.altcompany.R.layout.fragment_company_profile);
      sKeys.put("layout/fragment_confirm_code_0", apps.app.altcompany.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_forget_password_0", apps.app.altcompany.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_home_0", apps.app.altcompany.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", apps.app.altcompany.R.layout.fragment_login);
      sKeys.put("layout/fragment_order_detail_0", apps.app.altcompany.R.layout.fragment_order_detail);
      sKeys.put("layout/fragment_privacy_0", apps.app.altcompany.R.layout.fragment_privacy);
      sKeys.put("layout/fragment_register_step1_0", apps.app.altcompany.R.layout.fragment_register_step1);
      sKeys.put("layout/fragment_register_step2_0", apps.app.altcompany.R.layout.fragment_register_step2);
      sKeys.put("layout/fragment_register_step3_0", apps.app.altcompany.R.layout.fragment_register_step3);
      sKeys.put("layout/fragment_register_step4_0", apps.app.altcompany.R.layout.fragment_register_step4);
      sKeys.put("layout/fragment_splash_0", apps.app.altcompany.R.layout.fragment_splash);
      sKeys.put("layout/fragment_suggestion_0", apps.app.altcompany.R.layout.fragment_suggestion);
      sKeys.put("layout/fragment_user_details_0", apps.app.altcompany.R.layout.fragment_user_details);
      sKeys.put("layout/item_category_0", apps.app.altcompany.R.layout.item_category);
      sKeys.put("layout/item_menu_0", apps.app.altcompany.R.layout.item_menu);
      sKeys.put("layout/item_order_0", apps.app.altcompany.R.layout.item_order);
      sKeys.put("layout/item_recharge_0", apps.app.altcompany.R.layout.item_recharge);
      sKeys.put("layout/layout_action_bar_back_0", apps.app.altcompany.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", apps.app.altcompany.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_grand_0", apps.app.altcompany.R.layout.layout_grand);
      sKeys.put("layout/layout_navigation_drawer_0", apps.app.altcompany.R.layout.layout_navigation_drawer);
      sKeys.put("layout/terms_dialog_0", apps.app.altcompany.R.layout.terms_dialog);
    }
  }
}
