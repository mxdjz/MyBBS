package com.bbs.user.mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.bbs.user.model.DO.AdministratorDO;
import com.bbs.user.model.DO.MemberDO;

public interface AdministratorMapper {

    @Select("select * from T_BBS_ADMINISTRATOR where ADMINISTRATOR_ID = #{id}")
    @ResultMap("administrator")
    public MemberDO findAdministratorById(Long id);
    
    public void addAdministrator(AdministratorDO administrator);
    
    public void updateAdministrator(AdministratorDO administrator);
    
    public void deleteAdministrator(Long id);
}
