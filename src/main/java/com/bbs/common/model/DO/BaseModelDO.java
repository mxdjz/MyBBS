package com.bbs.common.model.DO;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 公共数据库字段
 * 
 * @author qy199
 *
 */
public class BaseModelDO {

    /**
     * 创建人
     */
    private long createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新人
     */
    private long updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 删除标识，0-未删除，1-已删除
     */
    private int deleteFlag;

    public long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 初始化数据信息
     */
    public void initBaseDO(int userId) {
        if (userId > -1) {
            this.createBy = userId;
            this.updateBy = userId;
        }
        Date cur = new Date();
        this.createDate = cur;
        this.updateDate = cur;
        this.deleteFlag = 0;
    }

    /**
     * 更新数据信息
     */
    public void updateBaseDO(int userId) {
        if (userId > -1) {
            this.updateBy = userId;
        }
        this.updateDate = new Date();
    }
}
