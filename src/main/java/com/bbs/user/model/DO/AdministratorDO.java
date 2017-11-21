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

    private int administratorId;

    private int memberId;

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + administratorId;
        result = prime * result + memberId;
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
        if (administratorId != other.administratorId)
            return false;
        if (memberId != other.memberId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AdministratorDO [administratorId=" + administratorId + ", memberId=" + memberId
                + "]";
    }

}
