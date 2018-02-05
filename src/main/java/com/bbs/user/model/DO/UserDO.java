package com.bbs.user.model.DO;

import java.io.Serializable;
import java.util.Date;

import com.bbs.common.model.DO.BaseModelDO;

/**
 * <p>
 * <h1>用户数据表</h1> <br/>
 * <h3>T_BBS_USER</h3>
 * </p>
 * 
 * @author qy199
 *
 */
public class UserDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 652776462190616854L;

    private Long userId;

    /**
     * 用户登录名
     */
    private String loginName;

    /**
     * 最后登录时间
     */
    private Date lastLoginDate;

    /**
     * 是否被冻结
     */
    private String isFreeze;

    /**
     * 用户密码（使用两次md5加密保存）
     */
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(String isFreeze) {
        this.isFreeze = isFreeze;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + ((loginName == null) ? 0 : loginName.hashCode());
        result = (int) (prime * result + userId);
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
        UserDO other = (UserDO) obj;
        if (loginName == null) {
            if (other.loginName != null)
                return false;
        } else if (!loginName.equals(other.loginName))
            return false;
        if (userId != other.userId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserDO [userId=" + userId + ", loginName=" + loginName + "]";
    }

}
