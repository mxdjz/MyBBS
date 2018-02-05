package com.bbs.post.model.DO;

import java.io.Serializable;

import com.bbs.common.model.DO.BaseModelDO;

public class PostContentDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1297692368532642745L;

    private Long postContentId;

    private String postContent;

    public Long getPostContentId() {
        return postContentId;
    }

    public void setPostContentId(Long postContentId) {
        this.postContentId = postContentId;
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
        int result = 17;
        result = prime * result + (int) (postContentId ^ (postContentId >>> 32));
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
        return true;
    }

    @Override
    public String toString() {
        return "PostContentDO [postContentId=" + postContentId + "]";
    }

}
