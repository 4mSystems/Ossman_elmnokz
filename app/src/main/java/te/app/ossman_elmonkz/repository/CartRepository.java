package te.app.ossman_elmonkz.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;
import te.app.ossman_elmonkz.utils.cart.CartDao;
import te.app.ossman_elmonkz.utils.cart.CartDataBase;

public class CartRepository {
    CartDao cartDao;
    LiveData<List<OrderRequest>> allProducts;
    LiveData<String> cartTotal;

    public CartRepository(Application application) {
        CartDataBase cartDataBase = CartDataBase.getInstance(application);
        cartDao = cartDataBase.cartDao();
        allProducts = cartDao.getProducts();
//        cartTotal = cartDao.getCartTotal();
    }

    public void insert(OrderRequest product) {
        new InsertProductAsyncTask(cartDao).execute(product);
    }

    public void update(OrderRequest product) {
        new UpdateProductAsyncTask(cartDao).execute(product);
    }

    public void deleteItem(int productId) {
        new DeleteProductAsyncTask(cartDao).execute(productId);

    }
    public void emptyCart() {
        new EmptyCartAsyncTask(cartDao).execute();
    }
    public LiveData<List<OrderRequest>> getAllProducts() {
        return allProducts;
    }

    public LiveData<String> getCartTotal() {
        return cartTotal;
    }


    private static class InsertProductAsyncTask extends AsyncTask<OrderRequest, Void, Void> {
        CartDao cartDao;
        long var_room_id;

        public InsertProductAsyncTask(CartDao cartDao) {
            this.cartDao = cartDao;
        }

        @Override
        protected Void doInBackground(OrderRequest... products) {
            var_room_id = cartDao.addProduct(products[0]);
            return null;
        }
    }

    private static class UpdateProductAsyncTask extends AsyncTask<OrderRequest, Void, Void> {
        private CartDao cartDao;

        public UpdateProductAsyncTask(CartDao cartDao) {
            this.cartDao = cartDao;
        }

        @Override
        protected Void doInBackground(OrderRequest... products) {
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
