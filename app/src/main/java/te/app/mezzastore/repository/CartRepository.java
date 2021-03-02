package te.app.mezzastore.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

import te.app.mezzastore.pages.products.models.productDetails.Product;
import te.app.mezzastore.utils.cart.CartDao;
import te.app.mezzastore.utils.cart.CartDataBase;

public class CartRepository {
    CartDao cartDao;
    LiveData<List<Product>> allProducts;
    LiveData<String> cartTotal;

    public CartRepository(Application application) {
        CartDataBase cartDataBase = CartDataBase.getInstance(application);
        cartDao = cartDataBase.cartDao();
        allProducts = cartDao.getProducts();
        cartTotal = cartDao.getCartTotal();
    }

    public void insert(Product product) {
        new InsertProductAsyncTask(cartDao).execute(product);
    }

    public void update(Product product) {
        new UpdateProductAsyncTask(cartDao).execute(product);
    }

    public void deleteItem(int productId) {
        new DeleteProductAsyncTask(cartDao).execute(productId);

    }
    public void emptyCart() {
        new EmptyCartAsyncTask(cartDao).execute();
    }
    public LiveData<List<Product>> getAllProducts() {
        return allProducts;
    }

    public LiveData<String> getCartTotal() {
        return cartTotal;
    }


    private static class InsertProductAsyncTask extends AsyncTask<Product, Void, Void> {
        CartDao cartDao;
        long var_room_id;

        public InsertProductAsyncTask(CartDao cartDao) {
            this.cartDao = cartDao;
        }

        @Override
        protected Void doInBackground(Product... products) {
            var_room_id = cartDao.addProduct(products[0]);
            return null;
        }
    }

    private static class UpdateProductAsyncTask extends AsyncTask<Product, Void, Void> {
        private CartDao cartDao;

        public UpdateProductAsyncTask(CartDao cartDao) {
            this.cartDao = cartDao;
        }

        @Override
        protected Void doInBackground(Product... products) {
            cartDao.updateProduct(products[0]);
            return null;
        }
    }

    private static class DeleteProductAsyncTask extends AsyncTask<Integer, Void, Void> {
        private CartDao cartDao;

        public DeleteProductAsyncTask(CartDao cartDao) {
            this.cartDao = cartDao;
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            cartDao.deleteItem(integers[0]);
            return null;
        }
    }
    private static class EmptyCartAsyncTask extends AsyncTask<Void, Void, Void> {
        private CartDao cartDao;

        public EmptyCartAsyncTask(CartDao cartDao) {
            this.cartDao = cartDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            cartDao.emptyProductCart();
            return null;
        }
    }

}
