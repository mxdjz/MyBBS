package com.bbs.user.model.DO;

import java.io.Serializable;

import com.bbs.common.model.DO.BaseModelDO;

/**
 * <p>
 * <h1>会员数据表</h1> <br/>
 * <h3>T_BBS_MEMBER</h3>
 * </p>
 * 
 * @author qy199
 *
 */
public class MemberDO extends BaseModelDO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8829094004805106395L;

    private Long memberId;

    private UserDO user;

    private AdministratorDO administrator;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 会员联系电话
     */
    private String mobile;

    /**
     * 会员QQ
     */
    private String qq;

    /**
     * 电子邮箱，使用电子邮件
     */
    private String email;

    /**
     * 会员住址
     */
    private String address;

    /**
     * 会员国籍
     */
    private String nationality;

    /**
     * 会员民族
     */
    private String folk;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }

    public AdministratorDO getAdministrator() {
        return administrator;
    }

    public void setAdministrator(AdministratorDO administrator) {
        this.administrator = administrator;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
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
        MemberDO other = (MemberDO) obj;
        if (memberId == null) {
            if (other.memberId != null)
                return false;
        } else if (!memberId.equals(other.memberId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MemberDO [memberId=" + memberId + "]";
    }

}
