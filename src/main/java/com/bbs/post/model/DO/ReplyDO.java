package com.bbs.post.model.DO;

import java.io.Serializable;

import com.bbs.common.model.DO.BaseModelDO;

/**
 * 回复数据表
 * 
 * @author qy199
 *
 */
public class ReplyDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6858866060338565063L;

    private long replyId;

    /**
     * 回复所属主题贴ID
     */
    private long postId;

    /**
     * 回复级别，1-对主题帖的回复，2-对回复的回复
     */
    private int level;

    /**
     * 回复内容
     */
    private String replyContent;

    public long getReplyId() {
        return replyId;
    }

    public void setReplyId(long replyId) {
        this.replyId = replyId;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (postId ^ (postId >>> 32));
        result = prime * result + (int) (replyId ^ (replyId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReplyDO other = (ReplyDO) obj;
        if (postId != other.postId)
            return false;
        if (replyId != other.replyId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ReplyDO [replyId=" + replyId + ", postId=" + postId + "]";
    }

}
