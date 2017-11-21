package com.bbs.post.model.DO;

import java.io.Serializable;
import java.util.Date;

import com.bbs.common.model.DO.BaseModelDO;

/**
 * 主题帖数据表
 * 
 * @author qy199
 *
 */
public class PostDO extends BaseModelDO implements Serializable {


    /**
     * 
     */
    private static final long serialVersionUID = 2650487875706691995L;

    private long postId;

    /**
     * 主题帖标题
     */
    private String postTitle;

    /**
     * 主题帖所属板块
     */
    private int plateId;

    /**
     * 回复数目
     */
    private int replyCount = 0;

    /**
     * 最后回复人
     */
    private long lastBy;

    /**
     * 最后回复时间
     */
    private Date lastDate;

    /**
     * 关键字
     */
    private String keyword;

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public int getPlateId() {
        return plateId;
    }

    public void setPlateId(int plateId) {
        this.plateId = plateId;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public long getLastBy() {
        return lastBy;
    }

    public void setLastBy(long lastBy) {
        this.lastBy = lastBy;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + plateId;
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
        PostDO other = (PostDO) obj;
        if (plateId != other.plateId)
            return false;
        if (postId != other.postId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PostDO [postId=" + postId + ", postTitle=" + postTitle + ", plateId=" + plateId
                + "]";
    }

}
