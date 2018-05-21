package cn.snowman.chat.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.snowman.chat.R;
import cn.snowman.chat.base.BaseFragment;

/**
 * @author
 * @date on 2018-5-18 16:15
 * @describe TODO
 */

public class SecretFragment extends BaseFragment {

    @BindView(R.id.recycler_secret_list)
    RecyclerView recyclerSecretList;
    @Override
    public int setLayoutResId() {
        return R.layout.fragment_secret;
    }
}
