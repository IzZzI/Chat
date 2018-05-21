package cn.snowman.chat.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by zhouzy on 2017/3/8.
 */

public abstract class BaseFragment extends Fragment {

    private View parentView;
    private Unbinder unBinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(setLayoutResId(), container, false);
        unBinder = ButterKnife.bind(this, parentView);
        return parentView;
    }

    /**
     * 设置Fragment布局文件id
     *
     * @return
     */
    public abstract int setLayoutResId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        unBinder.unbind();
    }
}
