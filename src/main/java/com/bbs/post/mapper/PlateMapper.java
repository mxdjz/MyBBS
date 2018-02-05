package com.bbs.post.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.bbs.post.model.DO.PlateDO;

public interface PlateMapper {

    @Select("select * from T_BBS_PLATE")
    @ResultMap("plate")
    public List<PlateDO> getAllPlate();
    
    @Select("select * from T_BBS_PLATE where PLATE_ID = #{id}")
    @ResultMap("plate")
    public PlateDO findPlateById(Long id);
    
    public void addPlate(PlateDO plate);
    
    public void updatePlate(PlateDO plate);
    
    public void deletePlate(Long id);
}
