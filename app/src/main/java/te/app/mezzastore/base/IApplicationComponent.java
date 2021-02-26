package te.app.mezzastore.base;

import javax.inject.Singleton;


import dagger.Component;
import te.app.mezzastore.activity.BaseActivity;
import te.app.mezzastore.activity.MainActivity;
import te.app.mezzastore.connection.ConnectionModule;
import te.app.mezzastore.pages.cart.CartFragment;
import te.app.mezzastore.pages.cart.CreateOrderFragment;
import te.app.mezzastore.pages.favorites.FavoritesFragment;
import te.app.mezzastore.pages.home.HomeFragment;
import te.app.mezzastore.pages.products.ProductDetailsFragment;
import te.app.mezzastore.pages.products.ProductsFragment;
import te.app.mezzastore.pages.splash.SplashFragment;
import te.app.mezzastore.pages.subCategories.SubCategoriesFragment;

@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(SplashFragment splashFragment);

    void inject(HomeFragment homeFragment);

    void inject(SubCategoriesFragment subCategoriesFragment);

    void inject(ProductsFragment productsFragment);

    void inject(ProductDetailsFragment productDetailsFragment);

    void inject(CartFragment cartFragment);

    void inject(CreateOrderFragment createOrderFragment);

    void inject(FavoritesFragment favoritesFragment);


    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
