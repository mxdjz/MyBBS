package com.bbs.user.mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.bbs.user.model.DO.UserDO;

public interface UserMapper {

    @Select("select * from T_BBS_USER where USER_ID = #{id}")
    @ResultMap("user")
    public UserDO findUserById(Long id);
    
    public void addUser(UserDO user);
    
    public void updateUser(UserDO user);
    
    public void deleteUser(Long id);
}
