package cn.snowman.chat.entity;

import cn.bmob.v3.BmobObject;

/**
 * @author
 * @date on 2018-5-25 17:48
 * @describe TODO
 */

public class Comment extends BmobObject {
    private String nickName;
    private String content;

    public String getNickName() {
        return nickName == null ? "" : nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContent() {
        return content == null ? "" : content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
