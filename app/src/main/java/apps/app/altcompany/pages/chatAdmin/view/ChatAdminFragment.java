package apps.app.altcompany.pages.chatAdmin.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
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

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentChatAdminBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdmin;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdminResponse;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdminSendResponse;
import apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.services.RealTimeReceiver;

public class ChatAdminFragment extends BaseFragment implements RealTimeReceiver.MessageReceiverListener {

    private Context context;
    private FragmentChatAdminBinding binding;
    @Inject
    ChatAdminViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat_admin, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            if (viewModel.getPassingObject().getObject() != null && viewModel.getPassingObject().getObject().equals(Constants.CHAT_ADMIN))
                viewModel.chatAdmin();
            else
                viewModel.chatOrder();
        }
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.CHAT_ADMIN) || mutable.message.equals(Constants.CHAT)) {
                viewModel.adapter.update(((ChatAdminResponse) mutable.object).getData());
                if (viewModel.adapter.getChatList().size() > 0)
                    new Handler().postDelayed(() -> binding.rcChat.smoothScrollToPosition(viewModel.adapter.getChatList().size() - 1), 200);
            } else if (((Mutable) o).message.equals(Constants.SEND_MESSAGE)) {
                ChatAdminSendResponse chatSendResponse = (ChatAdminSendResponse) ((Mutable) o).object;
                chatSendResponse.getData().setSenderType(1);
                viewModel.adapter.getChatList().add(chatSendResponse.getData());
                binding.edMessage.setText("");
                binding.edMessage.setHint(getResources().getString(R.string.chat_hint));
                binding.rcChat.scrollToPosition(viewModel.adapter.getItemCount() - 1);
                viewModel.adapter.notifyItemChanged(viewModel.adapter.getItemCount() - 1);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
        MyApplication.getInstance().setMessageReceiverListener(this);
    }

    @Override
    public void onMessageChanged(ChatAdmin messagesItem) {
        if (messagesItem != null) {
            viewModel.adapter.getChatList().add(messagesItem);
            viewModel.adapter.notifyItemInserted(viewModel.adapter.getChatList().size() - 1);
            binding.rcChat.scrollToPosition(viewModel.adapter.getChatList().size() - 1);
        }
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
