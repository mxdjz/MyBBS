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

    private Long replyId;

    /**
     * 回复所属主题贴ID
     */
    private Long postId;

    /**
     * 父回复ID
     */
    private Long parentReplyId;

    /**
     * 回复级别，1-对主题帖的回复，2-对回复的回复
     */
    private Integer level;

    /**
     * 回复内容
     */
    private String replyContent;

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getParentReplyId() {
        return parentReplyId;
    }

    public void setParentReplyId(Long parentReplyId) {
        this.parentReplyId = parentReplyId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
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
        result = prime * result + ((parentReplyId == null) ? 0 : parentReplyId.hashCode());
        result = prime * result + ((postId == null) ? 0 : postId.hashCode());
        result = prime * result + ((replyId == null) ? 0 : replyId.hashCode());
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
        if (parentReplyId == null) {
            if (other.parentReplyId != null)
                return false;
        } else if (!parentReplyId.equals(other.parentReplyId))
            return false;
        if (postId == null) {
            if (other.postId != null)
                return false;
        } else if (!postId.equals(other.postId))
            return false;
        if (replyId == null) {
            if (other.replyId != null)
                return false;
        } else if (!replyId.equals(other.replyId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ReplyDO [replyId=" + replyId + ", postId=" + postId + ", parentReplyId="
                + parentReplyId + "]";
    }

}
