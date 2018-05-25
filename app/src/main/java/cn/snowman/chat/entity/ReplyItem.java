package cn.snowman.chat.entity;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

import cn.snowman.chat.adapter.SecretRecyclerAdapter;

/**
 * @author
 * @date on 2018-5-22 11:10
 * @describe TODO
 */

public class ReplyItem extends AbstractExpandableItem implements MultiItemEntity {

    private String text;

    public String getText() {
        return text == null ? "" : text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int getItemType() {
        return SecretRecyclerAdapter.TYPE_REPLY;
    }

    @Override
    public int getLevel() {
        return 2;
    }
}
