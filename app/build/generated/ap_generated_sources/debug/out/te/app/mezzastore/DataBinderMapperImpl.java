package te.app.mezzastore;

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
import te.app.mezzastore.databinding.ActivityBaseBindingImpl;
import te.app.mezzastore.databinding.ActivityMainBindingImpl;
import te.app.mezzastore.databinding.FilterDialogBindingImpl;
import te.app.mezzastore.databinding.FragmentCartBindingImpl;
import te.app.mezzastore.databinding.FragmentContactBindingImpl;
import te.app.mezzastore.databinding.FragmentCreateOrderBindingImpl;
import te.app.mezzastore.databinding.FragmentFavoritesBindingImpl;
import te.app.mezzastore.databinding.FragmentHomeBindingImpl;
import te.app.mezzastore.databinding.FragmentProductDetailsBindingImpl;
import te.app.mezzastore.databinding.FragmentProductsBindingImpl;
import te.app.mezzastore.databinding.FragmentSplashBindingImpl;
import te.app.mezzastore.databinding.FragmentSubCategoriesBindingImpl;
import te.app.mezzastore.databinding.ItemCartBindingImpl;
import te.app.mezzastore.databinding.ItemFavoriteBindingImpl;
import te.app.mezzastore.databinding.ItemHomeBindingImpl;
import te.app.mezzastore.databinding.ItemProductsBindingImpl;
import te.app.mezzastore.databinding.LayoutActionBarBackBindingImpl;
import te.app.mezzastore.databinding.LayoutActionBarHomeBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FILTERDIALOG = 3;

  private static final int LAYOUT_FRAGMENTCART = 4;

  private static final int LAYOUT_FRAGMENTCONTACT = 5;

  private static final int LAYOUT_FRAGMENTCREATEORDER = 6;

  private static final int LAYOUT_FRAGMENTFAVORITES = 7;

  private static final int LAYOUT_FRAGMENTHOME = 8;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAILS = 9;

  private static final int LAYOUT_FRAGMENTPRODUCTS = 10;

  private static final int LAYOUT_FRAGMENTSPLASH = 11;

  private static final int LAYOUT_FRAGMENTSUBCATEGORIES = 12;

  private static final int LAYOUT_ITEMCART = 13;

  private static final int LAYOUT_ITEMFAVORITE = 14;

  private static final int LAYOUT_ITEMHOME = 15;

  private static final int LAYOUT_ITEMPRODUCTS = 16;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 17;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.filter_dialog, LAYOUT_FILTERDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_create_order, LAYOUT_FRAGMENTCREATEORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_favorites, LAYOUT_FRAGMENTFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_product_details, LAYOUT_FRAGMENTPRODUCTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_products, LAYOUT_FRAGMENTPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.fragment_sub_categories, LAYOUT_FRAGMENTSUBCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.item_cart, LAYOUT_ITEMCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.item_favorite, LAYOUT_ITEMFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.item_products, LAYOUT_ITEMPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.mezzastore.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
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
        case  LAYOUT_FILTERDIALOG: {
          if ("layout/filter_dialog_0".equals(tag)) {
            return new FilterDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for filter_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACT: {
          if ("layout/fragment_contact_0".equals(tag)) {
            return new FragmentContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATEORDER: {
          if ("layout/fragment_create_order_0".equals(tag)) {
            return new FragmentCreateOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_order is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITES: {
          if ("layout/fragment_favorites_0".equals(tag)) {
            return new FragmentFavoritesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorites is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
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
        case  LAYOUT_ITEMCART: {
          if ("layout/item_cart_0".equals(tag)) {
            return new ItemCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAVORITE: {
          if ("layout/item_favorite_0".equals(tag)) {
            return new ItemFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOME: {
          if ("layout/item_home_0".equals(tag)) {
            return new ItemHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRODUCTS: {
          if ("layout/item_products_0".equals(tag)) {
            return new ItemProductsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_products is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(14);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "baseViewModel");
      sKeys.put(2, "cartAdapter");
      sKeys.put(3, "categoriesAdapter");
      sKeys.put(4, "categoriesItem");
      sKeys.put(5, "homeData");
      sKeys.put(6, "homeSliderAdapter");
      sKeys.put(7, "itemViewModel");
      sKeys.put(8, "onBoardAdapter");
      sKeys.put(9, "passingObject");
      sKeys.put(10, "product");
      sKeys.put(11, "productDetails");
      sKeys.put(12, "productsAdapter");
      sKeys.put(13, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/activity_base_0", te.app.mezzastore.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", te.app.mezzastore.R.layout.activity_main);
      sKeys.put("layout/filter_dialog_0", te.app.mezzastore.R.layout.filter_dialog);
      sKeys.put("layout/fragment_cart_0", te.app.mezzastore.R.layout.fragment_cart);
      sKeys.put("layout/fragment_contact_0", te.app.mezzastore.R.layout.fragment_contact);
      sKeys.put("layout/fragment_create_order_0", te.app.mezzastore.R.layout.fragment_create_order);
      sKeys.put("layout/fragment_favorites_0", te.app.mezzastore.R.layout.fragment_favorites);
      sKeys.put("layout/fragment_home_0", te.app.mezzastore.R.layout.fragment_home);
      sKeys.put("layout/fragment_product_details_0", te.app.mezzastore.R.layout.fragment_product_details);
      sKeys.put("layout/fragment_products_0", te.app.mezzastore.R.layout.fragment_products);
      sKeys.put("layout/fragment_splash_0", te.app.mezzastore.R.layout.fragment_splash);
      sKeys.put("layout/fragment_sub_categories_0", te.app.mezzastore.R.layout.fragment_sub_categories);
      sKeys.put("layout/item_cart_0", te.app.mezzastore.R.layout.item_cart);
      sKeys.put("layout/item_favorite_0", te.app.mezzastore.R.layout.item_favorite);
      sKeys.put("layout/item_home_0", te.app.mezzastore.R.layout.item_home);
      sKeys.put("layout/item_products_0", te.app.mezzastore.R.layout.item_products);
      sKeys.put("layout/layout_action_bar_back_0", te.app.mezzastore.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", te.app.mezzastore.R.layout.layout_action_bar_home);
    }
  }
}
