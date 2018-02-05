package com.bbs.post.model.DO;

import java.io.Serializable;

import com.bbs.common.model.DO.BaseModelDO;

/**
 * 板块数据表
 * 
 * @author qy199
 *
 */
public class PlateDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2567552367215437546L;

    private Long plateId;

    /**
     * 板块标题
     */
    private String plateTitle;

    /**
     * 板块副标题
     */
    private String plateSubTitle;

    /**
     * 父板块ID
     */
    private Long plateParentId;

    /**
     * 缩略图URL
     */
    private String imageUrl;

    /**
     * 板块简介（不超过200字）
     */
    private String description;

    public Long getPlateId() {
        return plateId;
    }

    public void setPlateId(Long plateId) {
        this.plateId = plateId;
    }

    public String getPlateTitle() {
        return plateTitle;
    }

    public void setPlateTitle(String plateTitle) {
        this.plateTitle = plateTitle;
    }

    public String getPlateSubTitle() {
        return plateSubTitle;
    }

    public void setPlateSubTitle(String plateSubTitle) {
        this.plateSubTitle = plateSubTitle;
    }

    public Long getPlateParentId() {
        return plateParentId;
    }

    public void setPlateParentId(Long plateParentId) {
        this.plateParentId = plateParentId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + (int) (plateId ^ (plateId >>> 32));
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
        PlateDO other = (PlateDO) obj;
        if (plateId != other.plateId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PlateDO [plateId=" + plateId + ", plateTitle=" + plateTitle + "]";
    }

}
