package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleBrand;
import com.sodacar.deer.dao.model.VehicleBrandExample;
import com.sodacar.deer.dao.model.VehicleBrandWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleBrandMapper {
    long countByExample(VehicleBrandExample example);

    int deleteByExample(VehicleBrandExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(VehicleBrandWithBLOBs record);

    int insertSelective(VehicleBrandWithBLOBs record);

    List<VehicleBrandWithBLOBs> selectByExampleWithBLOBs(VehicleBrandExample example);

    List<VehicleBrand> selectByExample(VehicleBrandExample example);

    VehicleBrandWithBLOBs selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") VehicleBrandWithBLOBs record, @Param("example") VehicleBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleBrandWithBLOBs record, @Param("example") VehicleBrandExample example);

    int updateByExample(@Param("record") VehicleBrand record, @Param("example") VehicleBrandExample example);

    int updateByPrimaryKeySelective(VehicleBrandWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VehicleBrandWithBLOBs record);

    int updateByPrimaryKey(VehicleBrand record);
}