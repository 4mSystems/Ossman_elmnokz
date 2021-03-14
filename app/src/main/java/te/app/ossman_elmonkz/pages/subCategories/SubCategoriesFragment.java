package te.app.ossman_elmonkz.pages.subCategories;

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

import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentSubCategoriesBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.home.models.CategoriesItem;
import te.app.ossman_elmonkz.pages.subCategories.models.SubCategoriesResponse;
import te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesViewModel;
import te.app.ossman_elmonkz.utils.Constants;


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
            viewModel.setCategoriesItem(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), CategoriesItem.class));

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
