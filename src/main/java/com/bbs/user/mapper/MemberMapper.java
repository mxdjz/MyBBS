package com.bbs.user.mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.bbs.user.model.DO.MemberDO;

public interface MemberMapper {

    @Select("select * from T_BBS_MEMBER where MEMBER_ID = #{id}")
    @ResultMap("member")
    public MemberDO findMemberById(Long id);
    
    @Select("select * from T_BBS_MEMBER where USER_ID = #{userId}")
    @ResultMap("member")
    public MemberDO findMemberByUserId(Long userId);
    
    @Select("select * from T_BBS_MEMBER where ADMINISTRATOR_ID = #{adminitratorId}")
    @ResultMap("member")
    public MemberDO findMemberByAdminitratorId(Long adminitratorId);
    
    public void addMember(MemberDO member);
    
    public void updateMember(MemberDO member);
    
    public void deleteMember(Long id);
}
