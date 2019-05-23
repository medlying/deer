package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleBrand;
import com.sodacar.deer.dao.model.VehicleBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleBrandMapper {
    long countByExample(VehicleBrandExample example);

    int deleteByExample(VehicleBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VehicleBrand record);

    int insertSelective(VehicleBrand record);

    List<VehicleBrand> selectByExampleWithBLOBs(VehicleBrandExample example);

    List<VehicleBrand> selectByExample(VehicleBrandExample example);

    VehicleBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VehicleBrand record, @Param("example") VehicleBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleBrand record, @Param("example") VehicleBrandExample example);

    int updateByExample(@Param("record") VehicleBrand record, @Param("example") VehicleBrandExample example);

    int updateByPrimaryKeySelective(VehicleBrand record);

    int updateByPrimaryKeyWithBLOBs(VehicleBrand record);

    int updateByPrimaryKey(VehicleBrand record);
}