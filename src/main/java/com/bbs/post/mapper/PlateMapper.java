package com.bbs.post.mapper;

import java.util.List;

import com.bbs.post.model.DO.PlateDO;

public interface PlateMapper {

    public List<PlateDO> getAllPlate();
    
    public PlateDO findPlateById(int id);
    
    public void addPlate(PlateDO plate);
    
    public void updatePlate(PlateDO plate);
    
    public void deletePlate(int id);
}
