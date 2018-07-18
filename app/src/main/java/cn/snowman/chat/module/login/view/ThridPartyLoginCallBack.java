package cn.snowman.chat.module.login.view;

public interface ThridPartyLoginCallBack
{
	void onSuccessed();

	void onError(String errorMsg);

	void onCancle();
}
