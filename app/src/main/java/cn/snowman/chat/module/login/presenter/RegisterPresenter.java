package cn.snowman.chat.module.login.presenter;


import cn.snowman.chat.common.callback.CommonCallback;
import cn.snowman.chat.contract.RegisterContract;
import cn.snowman.chat.module.login.model.RegisterModel;

public class RegisterPresenter implements RegisterContract.IRegisterPresenter {
    private RegisterContract.IRegisterModel mRegisterModel;
    private RegisterContract.IRegisterView mRegisterView;

    public RegisterPresenter(RegisterContract.IRegisterView mRegisterView) {
        super();
        this.mRegisterView = mRegisterView;
        mRegisterModel = new RegisterModel();
    }

    @Override
    public void register(String username, String password, String email) {
        mRegisterModel.register(username, password, email, new CommonCallback() {

            @Override
            public void onSuccess(Object success) {
                mRegisterView.onRegisterSuccessed();
            }

            @Override
            public void onFail(Object fail) {
                mRegisterView.onRegisterFailed((String) fail);
            }
        });
    }

}
