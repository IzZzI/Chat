package cn.snowman.chat.contract;


import cn.snowman.chat.common.callback.CommonCallback;

public interface RegisterContract
{
	interface IRegisterPresenter
	{
		void register(String username, String password, String email);
	}

	interface IRegisterModel
	{
		void register(String username, String password, String email, CommonCallback callback);
	}

	interface IRegisterView
	{
		void onRegisterSuccessed();

		void onRegisterFailed(String errorMsg);
	}

}
