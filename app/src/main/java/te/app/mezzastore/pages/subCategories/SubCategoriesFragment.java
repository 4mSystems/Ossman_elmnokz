package te.app.mezzastore.pages.subCategories;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.mezzastore.PassingObject;
import te.app.mezzastore.R;
import te.app.mezzastore.base.BaseFragment;
import te.app.mezzastore.base.IApplicationComponent;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.databinding.FragmentSubCategoriesBinding;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.subCategories.models.SubCategoriesResponse;
import te.app.mezzastore.pages.subCategories.viewModels.SubCategoriesViewModel;
import te.app.mezzastore.utils.Constants;


public class SubCategoriesFragment extends BaseFragment {

    private Context context;
    @Inject
    SubCategoriesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSubCategoriesBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sub_categories, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.subCategories();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.SUB_CATEGORIES.equals(((Mutable) o).message)) {
                viewModel.getCategoriesAdapter().update(((SubCategoriesResponse) mutable.object).getCategoriesItemList());
                viewModel.getCategoriesAdapter().pageType = Constants.PRODUCTS;
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
