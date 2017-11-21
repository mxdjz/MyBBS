package com.bbs.user.mapper;

import com.bbs.user.model.DO.UserDO;

public interface UserMapper {

    public UserDO findUserById(long id);
    
    public void addUser(UserDO user);
    
    public void updateUser(UserDO user);
    
    public void deleteUser(long id);
}
