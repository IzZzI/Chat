package cn.snowman.chat.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.snowman.chat.R;
import cn.snowman.chat.adapter.SecretRecyclerAdapter;
import cn.snowman.chat.base.BaseFragment;
import cn.snowman.chat.entity.CommentItem;
import cn.snowman.chat.entity.ContentItem;
import cn.snowman.chat.entity.ReplyItem;

/**
 * @author
 * @date on 2018-5-18 16:15
 * @describe TODO
 */

public class SecretFragment extends BaseFragment {

    @BindView(R.id.recycler_secret_list)
    RecyclerView recyclerSecretList;
    private SecretRecyclerAdapter mSecretRecyclerAdapter;

    @Override
    public int setLayoutResId() {
        return R.layout.fragment_secret;
    }

    @Override
    public void init() {
        List dataList = generateData();

        mSecretRecyclerAdapter = new SecretRecyclerAdapter(dataList);
        mSecretRecyclerAdapter.expandAll();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerSecretList.setLayoutManager(linearLayoutManager);
        recyclerSecretList.setAdapter(mSecretRecyclerAdapter);

    }

    private List<MultiItemEntity> generateData() {
        List<MultiItemEntity> list = new ArrayList();
        ContentItem contentItem = new ContentItem();
        contentItem.setText("It is a test!");
        CommentItem commentItem = new CommentItem();
        commentItem.setText("good test");
        ReplyItem replyItem = new ReplyItem();
        replyItem.setText("3Q");
        ReplyItem replyItem1 = new ReplyItem();
        replyItem1.setText("No 3Ks");
        commentItem.addSubItem(replyItem);
        commentItem.addSubItem(replyItem1);
        contentItem.addSubItem(commentItem);
        list.add(contentItem);

        ContentItem contentItem1 = new ContentItem();
        contentItem1.setText("nice day!");
        CommentItem commentItem1 = new CommentItem();
        commentItem1.setText("that's right!");
        ReplyItem replyItem2 = new ReplyItem();
        replyItem2.setText("QAQ");
        ReplyItem replyItem3 = new ReplyItem();
        replyItem3.setText("!!!!!XD");
        commentItem1.addSubItem(replyItem2);
        commentItem1.addSubItem(replyItem3);
        contentItem1.addSubItem(commentItem1);
        list.add(contentItem1);
        return list;
    }
}
