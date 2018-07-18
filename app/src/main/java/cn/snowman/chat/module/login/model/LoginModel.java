package cn.snowman.chat.module.login.model;

import cn.snowman.chat.common.callback.CommonCallback;
import cn.snowman.chat.contract.LoginContract;

public class LoginModel implements LoginContract.ILoginModel {

    @Override
    public void login(String email, String password, final CommonCallback callback) {
    }

}
