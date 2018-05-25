package cn.snowman.chat.base;

import android.app.Application;

import butterknife.ButterKnife;
import cn.bmob.v3.Bmob;
import cn.snowman.chat.common.constant.Constant;

/**
 * @author
 * @date on 2018-5-22 11:39
 * @describe TODO
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, Constant.BMOB_APPLICATION_ID);
    }
}
