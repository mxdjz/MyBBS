package com.bbs.user.model.DO;

import java.io.Serializable;

import com.bbs.common.model.DO.BaseModelDO;

/**
 * <p>
 * <h1>管理员标记表</h1> <br/>
 * <h3>T_BBS_ADMINISTRATOR</h3>
 * </p>
 * 
 * @author qy199
 *
 */
public class AdministratorDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 4068018339782661776L;

    private Long administratorId;

    public Long getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Long administratorId) {
        this.administratorId = administratorId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((administratorId == null) ? 0 : administratorId.hashCode());
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
        AdministratorDO other = (AdministratorDO) obj;
        if (administratorId == null) {
            if (other.administratorId != null)
                return false;
        } else if (!administratorId.equals(other.administratorId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AdministratorDO [administratorId=" + administratorId + "]";
    }

}
