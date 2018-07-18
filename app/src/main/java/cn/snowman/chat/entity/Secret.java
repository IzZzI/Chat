package cn.snowman.chat.entity;

import java.io.Serializable;

/**
 * @author
 * @date on 2018-5-25 16:34
 * @describe TODO
 */

public class Secret implements Serializable {
    private String nickName;
    private String uploadTime;
    private String head_portrait;
    private String content;

    public String getNickName() {
        return nickName == null ? "" : nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUploadTime() {
        return uploadTime == null ? "" : uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getHead_portrait() {
        return head_portrait == null ? "" : head_portrait;
    }

    public void setHead_portrait(String head_portrait) {
        this.head_portrait = head_portrait;
    }

    public String getContent() {
        return content == null ? "" : content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
