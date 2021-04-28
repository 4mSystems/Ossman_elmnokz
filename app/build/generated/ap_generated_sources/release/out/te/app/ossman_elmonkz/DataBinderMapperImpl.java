package te.app.ossman_elmonkz;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import te.app.ossman_elmonkz.databinding.ActivityBaseBindingImpl;
import te.app.ossman_elmonkz.databinding.ActivityMainBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentAboutBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentAgentsBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentBrandModelsPartionBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentBuyingBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentCartBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentClientsBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentContactsBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentCreateOrderBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentGalleryBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentHomeBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentMoreBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentOnboardBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentProductDetailsBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentProductsBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentSplashBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentSubCategoriesBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentSubCategorySearchBindingImpl;
import te.app.ossman_elmonkz.databinding.FragmentSuggestionsBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemAgentsBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemBrandBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemCartBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemClientsBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemColorBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemGalleryBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemHomeBindingImpl;
import te.app.ossman_elmonkz.databinding.ItemSearchBindingImpl;
import te.app.ossman_elmonkz.databinding.LayoutActionBarBackBindingImpl;
import te.app.ossman_elmonkz.databinding.LayoutActionBarHomeBindingImpl;
import te.app.ossman_elmonkz.databinding.LayoutTesBindingImpl;
import te.app.ossman_elmonkz.databinding.SendRequestDialogBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTABOUT = 3;

  private static final int LAYOUT_FRAGMENTAGENTS = 4;

  private static final int LAYOUT_FRAGMENTBRANDMODELSPARTION = 5;

  private static final int LAYOUT_FRAGMENTBUYING = 6;

  private static final int LAYOUT_FRAGMENTCART = 7;

  private static final int LAYOUT_FRAGMENTCLIENTS = 8;

  private static final int LAYOUT_FRAGMENTCONTACTS = 9;

  private static final int LAYOUT_FRAGMENTCREATEORDER = 10;

  private static final int LAYOUT_FRAGMENTGALLERY = 11;

  private static final int LAYOUT_FRAGMENTHOME = 12;

  private static final int LAYOUT_FRAGMENTMORE = 13;

  private static final int LAYOUT_FRAGMENTONBOARD = 14;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAILS = 15;

  private static final int LAYOUT_FRAGMENTPRODUCTS = 16;

  private static final int LAYOUT_FRAGMENTSPLASH = 17;

  private static final int LAYOUT_FRAGMENTSUBCATEGORIES = 18;

  private static final int LAYOUT_FRAGMENTSUBCATEGORYSEARCH = 19;

  private static final int LAYOUT_FRAGMENTSUGGESTIONS = 20;

  private static final int LAYOUT_ITEMAGENTS = 21;

  private static final int LAYOUT_ITEMBRAND = 22;

  private static final int LAYOUT_ITEMCART = 23;

  private static final int LAYOUT_ITEMCLIENTS = 24;

  private static final int LAYOUT_ITEMCOLOR = 25;

  private static final int LAYOUT_ITEMGALLERY = 26;

  private static final int LAYOUT_ITEMHOME = 27;

  private static final int LAYOUT_ITEMSEARCH = 28;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 29;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 30;

  private static final int LAYOUT_LAYOUTTES = 31;

  private static final int LAYOUT_SENDREQUESTDIALOG = 32;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(32);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_agents, LAYOUT_FRAGMENTAGENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_brand_models_partion, LAYOUT_FRAGMENTBRANDMODELSPARTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_buying, LAYOUT_FRAGMENTBUYING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_clients, LAYOUT_FRAGMENTCLIENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_contacts, LAYOUT_FRAGMENTCONTACTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_create_order, LAYOUT_FRAGMENTCREATEORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_gallery, LAYOUT_FRAGMENTGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_more, LAYOUT_FRAGMENTMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_product_details, LAYOUT_FRAGMENTPRODUCTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_products, LAYOUT_FRAGMENTPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_sub_categories, LAYOUT_FRAGMENTSUBCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_sub_category_search, LAYOUT_FRAGMENTSUBCATEGORYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.fragment_suggestions, LAYOUT_FRAGMENTSUGGESTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_agents, LAYOUT_ITEMAGENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_brand, LAYOUT_ITEMBRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_cart, LAYOUT_ITEMCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_clients, LAYOUT_ITEMCLIENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_color, LAYOUT_ITEMCOLOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_gallery, LAYOUT_ITEMGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.layout_tes, LAYOUT_LAYOUTTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.ossman_elmonkz.R.layout.send_request_dialog, LAYOUT_SENDREQUESTDIALOG);
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
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAGENTS: {
          if ("layout/fragment_agents_0".equals(tag)) {
            return new FragmentAgentsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_agents is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBRANDMODELSPARTION: {
          if ("layout/fragment_brand_models_partion_0".equals(tag)) {
            return new FragmentBrandModelsPartionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_brand_models_partion is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBUYING: {
          if ("layout/fragment_buying_0".equals(tag)) {
            return new FragmentBuyingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_buying is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCLIENTS: {
          if ("layout/fragment_clients_0".equals(tag)) {
            return new FragmentClientsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_clients is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACTS: {
          if ("layout/fragment_contacts_0".equals(tag)) {
            return new FragmentContactsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contacts is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATEORDER: {
          if ("layout/fragment_create_order_0".equals(tag)) {
            return new FragmentCreateOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_order is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGALLERY: {
          if ("layout/fragment_gallery_0".equals(tag)) {
            return new FragmentGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMORE: {
          if ("layout/fragment_more_0".equals(tag)) {
            return new FragmentMoreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_more is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARD: {
          if ("layout/fragment_onboard_0".equals(tag)) {
            return new FragmentOnboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAILS: {
          if ("layout/fragment_product_details_0".equals(tag)) {
            return new FragmentProductDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTS: {
          if ("layout/fragment_products_0".equals(tag)) {
            return new FragmentProductsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_products is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUBCATEGORIES: {
          if ("layout/fragment_sub_categories_0".equals(tag)) {
            return new FragmentSubCategoriesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sub_categories is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUBCATEGORYSEARCH: {
          if ("layout/fragment_sub_category_search_0".equals(tag)) {
            return new FragmentSubCategorySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sub_category_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUGGESTIONS: {
          if ("layout/fragment_suggestions_0".equals(tag)) {
            return new FragmentSuggestionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_suggestions is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAGENTS: {
          if ("layout/item_agents_0".equals(tag)) {
            return new ItemAgentsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_agents is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBRAND: {
          if ("layout/item_brand_0".equals(tag)) {
            return new ItemBrandBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_brand is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCART: {
          if ("layout/item_cart_0".equals(tag)) {
            return new ItemCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCLIENTS: {
          if ("layout/item_clients_0".equals(tag)) {
            return new ItemClientsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_clients is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOLOR: {
          if ("layout/item_color_0".equals(tag)) {
            return new ItemColorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_color is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGALLERY: {
          if ("layout/item_gallery_0".equals(tag)) {
            return new ItemGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOME: {
          if ("layout/item_home_0".equals(tag)) {
            return new ItemHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCH: {
          if ("layout/item_search_0".equals(tag)) {
            return new ItemSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
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
        case  LAYOUT_LAYOUTTES: {
          if ("layout/layout_tes_0".equals(tag)) {
            return new LayoutTesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_tes is invalid. Received: " + tag);
        }
        case  LAYOUT_SENDREQUESTDIALOG: {
          if ("layout/send_request_dialog_0".equals(tag)) {
            return new SendRequestDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for send_request_dialog is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(30);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutMain");
      sKeys.put(2, "agentData");
      sKeys.put(3, "agentsAdapter");
      sKeys.put(4, "baseViewModel");
      sKeys.put(5, "brandModelAdapter");
      sKeys.put(6, "brandModelsPartionMain");
      sKeys.put(7, "brandsModellsItem");
      sKeys.put(8, "cartAdapter");
      sKeys.put(9, "categoriesAdapter");
      sKeys.put(10, "categoriesItem");
      sKeys.put(11, "clientData");
      sKeys.put(12, "clientsAdapter");
      sKeys.put(13, "dataFromSearchRequest");
      sKeys.put(14, "galleryAdapter");
      sKeys.put(15, "galleryData");
      sKeys.put(16, "itemViewModel");
      sKeys.put(17, "onBoardAdapter");
      sKeys.put(18, "onBoardViewModels");
      sKeys.put(19, "passingObject");
      sKeys.put(20, "product");
      sKeys.put(21, "productColor");
      sKeys.put(22, "productColorAdapter");
      sKeys.put(23, "productDetails");
      sKeys.put(24, "productsAdapter");
      sKeys.put(25, "searchAdapter");
      sKeys.put(26, "searchItem");
      sKeys.put(27, "searchProgressVisible");
      sKeys.put(28, "viewModel");
      sKeys.put(29, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(32);

    static {
      sKeys.put("layout/activity_base_0", te.app.ossman_elmonkz.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", te.app.ossman_elmonkz.R.layout.activity_main);
      sKeys.put("layout/fragment_about_0", te.app.ossman_elmonkz.R.layout.fragment_about);
      sKeys.put("layout/fragment_agents_0", te.app.ossman_elmonkz.R.layout.fragment_agents);
      sKeys.put("layout/fragment_brand_models_partion_0", te.app.ossman_elmonkz.R.layout.fragment_brand_models_partion);
      sKeys.put("layout/fragment_buying_0", te.app.ossman_elmonkz.R.layout.fragment_buying);
      sKeys.put("layout/fragment_cart_0", te.app.ossman_elmonkz.R.layout.fragment_cart);
      sKeys.put("layout/fragment_clients_0", te.app.ossman_elmonkz.R.layout.fragment_clients);
      sKeys.put("layout/fragment_contacts_0", te.app.ossman_elmonkz.R.layout.fragment_contacts);
      sKeys.put("layout/fragment_create_order_0", te.app.ossman_elmonkz.R.layout.fragment_create_order);
      sKeys.put("layout/fragment_gallery_0", te.app.ossman_elmonkz.R.layout.fragment_gallery);
      sKeys.put("layout/fragment_home_0", te.app.ossman_elmonkz.R.layout.fragment_home);
      sKeys.put("layout/fragment_more_0", te.app.ossman_elmonkz.R.layout.fragment_more);
      sKeys.put("layout/fragment_onboard_0", te.app.ossman_elmonkz.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_product_details_0", te.app.ossman_elmonkz.R.layout.fragment_product_details);
      sKeys.put("layout/fragment_products_0", te.app.ossman_elmonkz.R.layout.fragment_products);
      sKeys.put("layout/fragment_splash_0", te.app.ossman_elmonkz.R.layout.fragment_splash);
      sKeys.put("layout/fragment_sub_categories_0", te.app.ossman_elmonkz.R.layout.fragment_sub_categories);
      sKeys.put("layout/fragment_sub_category_search_0", te.app.ossman_elmonkz.R.layout.fragment_sub_category_search);
      sKeys.put("layout/fragment_suggestions_0", te.app.ossman_elmonkz.R.layout.fragment_suggestions);
      sKeys.put("layout/item_agents_0", te.app.ossman_elmonkz.R.layout.item_agents);
      sKeys.put("layout/item_brand_0", te.app.ossman_elmonkz.R.layout.item_brand);
      sKeys.put("layout/item_cart_0", te.app.ossman_elmonkz.R.layout.item_cart);
      sKeys.put("layout/item_clients_0", te.app.ossman_elmonkz.R.layout.item_clients);
      sKeys.put("layout/item_color_0", te.app.ossman_elmonkz.R.layout.item_color);
      sKeys.put("layout/item_gallery_0", te.app.ossman_elmonkz.R.layout.item_gallery);
      sKeys.put("layout/item_home_0", te.app.ossman_elmonkz.R.layout.item_home);
      sKeys.put("layout/item_search_0", te.app.ossman_elmonkz.R.layout.item_search);
      sKeys.put("layout/layout_action_bar_back_0", te.app.ossman_elmonkz.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", te.app.ossman_elmonkz.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_tes_0", te.app.ossman_elmonkz.R.layout.layout_tes);
      sKeys.put("layout/send_request_dialog_0", te.app.ossman_elmonkz.R.layout.send_request_dialog);
    }
  }
}
