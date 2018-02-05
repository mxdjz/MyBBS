package com.bbs.common.model.DO;

import java.util.Date;

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
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 删除标识，0-未删除，1-已删除
     */
    private Integer deleteFlag;

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 初始化数据信息
     */
    public void initBaseDO(Long userId) {
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
    public void updateBaseDO(Long userId) {
        if (userId > -1) {
            this.updateBy = userId;
        }
        this.updateDate = new Date();
    }
    
    /**
     * 设置对象逻辑删除状态
     */
    public void setDeleteObject() {
        setDeleteFlag(1);
    }
}
