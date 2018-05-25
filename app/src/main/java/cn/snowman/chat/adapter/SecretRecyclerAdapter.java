package cn.snowman.chat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import cn.snowman.chat.R;
import cn.snowman.chat.entity.CommentItem;
import cn.snowman.chat.entity.ContentItem;
import cn.snowman.chat.entity.ReplyItem;

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
    //评论
    public static final int TYPE_COMMENT = 2;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public SecretRecyclerAdapter(List data) {
        super(data);
        addItemType(TYPE_CONTENT, R.layout.item_secret_content);
        addItemType(TYPE_REPLY, R.layout.item_secret_reply);
        addItemType(TYPE_COMMENT, R.layout.item_secret_comment);
    }

    @Override
    protected BaseViewHolder createBaseViewHolder(View view) {
        AutoUtils.auto(view);
        return super.createBaseViewHolder(view);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case TYPE_CONTENT:
                ContentItem content = (ContentItem) item;
                helper.setText(R.id.tv_item_secret_content_text, content.getText());
                break;
            case TYPE_REPLY:
                ReplyItem reply = (ReplyItem) item;
                helper.setText(R.id.tv_item_secret_reply_text, reply.getText());
                break;
            case TYPE_COMMENT:
                CommentItem comment = (CommentItem) item;
                helper.setText(R.id.tv_item_secret_comment_text, comment.getText());
                break;
            default:
                break;
        }
    }

}
