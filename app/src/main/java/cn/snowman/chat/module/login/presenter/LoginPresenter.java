package cn.snowman.chat.module.login.presenter;


import cn.snowman.chat.common.callback.CommonCallback;
import cn.snowman.chat.contract.LoginContract;
import cn.snowman.chat.module.login.model.LoginModel;
import cn.snowman.chat.module.login.view.ThridPartyLoginCallBack;

public class LoginPresenter implements LoginContract.ILoginPresenter
{
	private LoginContract.ILoginModel mLoginModel;
	private LoginContract.ILoginVew mLoginView;

	public LoginPresenter(LoginContract.ILoginVew mLoginView)
	{
		super();
		this.mLoginView = mLoginView;
		this.mLoginModel = new LoginModel();
	}

	@Override
	public void login(String email, String password)
	{
		mLoginModel.login(email, password, new CommonCallback()
		{

			@Override
			public void onSuccess(Object success)
			{
				mLoginView.onLoginSuccessed(success);
			}

			@Override
			public void onFail(Object fail)
			{
				mLoginView.onLoginFailed((String) fail);
			}
		});
	}

}
