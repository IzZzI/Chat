package cn.snowman.chat.contract;


import cn.snowman.chat.common.callback.CommonCallback;

public interface LoginContract {
    interface ILoginPresenter {
        /**
         * 登录
         *
         * @param email    邮箱地址
         * @param password 密码
         */
        void login(String email, String password);

    }

    interface ILoginModel {

        void login(String email, String password, CommonCallback callback);

    }

    interface ILoginVew {
        void onLoginSuccessed(Object object);

        void onLoginFailed(String errorMsg);

    }
}
