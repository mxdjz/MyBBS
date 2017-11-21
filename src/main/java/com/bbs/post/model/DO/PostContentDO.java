package com.bbs.post.model.DO;

import java.io.Serializable;

import com.bbs.common.model.DO.BaseModelDO;

public class PostContentDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3932786319609355984L;

    private long postContentId;

    private long postId;

    private String postContent;

    public long getPostContentId() {
        return postContentId;
    }

    public void setPostContentId(long postContentId) {
        this.postContentId = postContentId;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (postContentId ^ (postContentId >>> 32));
        result = prime * result + (int) (postId ^ (postId >>> 32));
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
        PostContentDO other = (PostContentDO) obj;
        if (postContentId != other.postContentId)
            return false;
        if (postId != other.postId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PostContentDO [postContentId=" + postContentId + ", postId=" + postId + "]";
    }

}
