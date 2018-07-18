package cn.snowman.chat.common.callback;

/**
 * Created by 正义 on 2017/5/5.
 */

public interface CommonProgressCallback
{
	void onSuccess(Object success);

	void onFail(Object fail);

	void onProgress(int progress);

}
