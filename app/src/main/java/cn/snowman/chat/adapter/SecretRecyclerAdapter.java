package cn.snowman.chat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

/**
 * @author
 * @date on 2018-5-21 12:03
 * @describe TODO
 */

public class SecretRecyclerAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    //内容
    public static final int TYPE_CONTENT = 0;
    //回复
    public static final int TYPE_REPLY = 1;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public SecretRecyclerAdapter(List data) {
        super(data);
    }

    @Override
    protected BaseViewHolder createBaseViewHolder(View view) {
        AutoUtils.auto(view);
        return super.createBaseViewHolder(view);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiItemEntity item) {

    }

}
