package com.bbs.notice.model.DO;

import java.io.Serializable;

import com.bbs.common.model.DO.BaseModelDO;

/**
 * 论坛公告数据表
 * 
 * @author qy199
 *
 */
public class NoticeDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4374008543769180790L;

    private long noticeId;

    /**
     * 公告信息
     */
    private String message;

    /**
     * 公告类型（系统公告，板块公告）
     */
    private int noticeType;

    public long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(long noticeId) {
        this.noticeId = noticeId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNoticeType(int noticeType) {
        this.noticeType = noticeType;
    }

    public int getNoticeType() {
        return noticeType;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + noticeId);
        result = prime * result + noticeType;
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
        NoticeDO other = (NoticeDO) obj;
        if (noticeId != other.noticeId)
            return false;
        if (noticeType != other.noticeType)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "NoticeDO [noticeId=" + noticeId + ", noticeType=" + noticeType + "]";
    }

}
