package te.app.ossman_elmonkz.base;

import javax.inject.Singleton;


import dagger.Component;
import te.app.ossman_elmonkz.activity.BaseActivity;
import te.app.ossman_elmonkz.activity.MainActivity;
import te.app.ossman_elmonkz.connection.ConnectionModule;
import te.app.ossman_elmonkz.pages.agentsAndClients.AgentsFragment;
import te.app.ossman_elmonkz.pages.agentsAndClients.ClientsFragment;
import te.app.ossman_elmonkz.pages.buying.ProductDetailsFragment;
import te.app.ossman_elmonkz.pages.buying.SelectBrandModelPartionFragment;
import te.app.ossman_elmonkz.pages.cart.CartFragment;
import te.app.ossman_elmonkz.pages.cart.CreateOrderFragment;
import te.app.ossman_elmonkz.pages.buying.BuyingFragment;
import te.app.ossman_elmonkz.pages.gallery.GalleryFragment;
import te.app.ossman_elmonkz.pages.home.HomeFragment;
import te.app.ossman_elmonkz.pages.more.MoreFragment;
import te.app.ossman_elmonkz.pages.onBoard.OnBoardFragment;
import te.app.ossman_elmonkz.pages.products.ProductsFragment;
import te.app.ossman_elmonkz.pages.settings.AboutAppFragment;
import te.app.ossman_elmonkz.pages.settings.ContactFragment;
import te.app.ossman_elmonkz.pages.settings.SuggestionsFragment;
import te.app.ossman_elmonkz.pages.splash.SplashFragment;
import te.app.ossman_elmonkz.pages.subCategories.SubCategoriesFragment;
import te.app.ossman_elmonkz.pages.subCategories.SubCategorySearchFragment;

@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(SplashFragment splashFragment);

    void inject(OnBoardFragment onBoardFragment);

    void inject(HomeFragment homeFragment);

    void inject(SubCategoriesFragment subCategoriesFragment);

    void inject(ProductsFragment productsFragment);

    void inject(GalleryFragment galleryFragment);


    void inject(CartFragment cartFragment);

    void inject(CreateOrderFragment createOrderFragment);

    void inject(BuyingFragment favoritesFragment);

    void inject(SuggestionsFragment contactUsFragment);

    void inject(SubCategorySearchFragment subCategorySearchFragment);

    void inject(AgentsFragment agentsFragment);

    void inject(ClientsFragment clientsFragment);

    void inject(ContactFragment contactFragment);

    void inject(AboutAppFragment aboutAppFragment);

    void inject(MoreFragment moreFragment);

    void inject(ProductDetailsFragment productDetailsFragment);

    void inject(SelectBrandModelPartionFragment selectBrandModelPartionFragment);



    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
