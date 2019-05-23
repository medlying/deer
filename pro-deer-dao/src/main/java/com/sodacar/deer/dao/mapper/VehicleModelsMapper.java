package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleModels;
import com.sodacar.deer.dao.model.VehicleModelsExample;
import com.sodacar.deer.dao.model.VehicleModelsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleModelsMapper {
    long countByExample(VehicleModelsExample example);

    int deleteByExample(VehicleModelsExample example);

    int insert(VehicleModelsWithBLOBs record);

    int insertSelective(VehicleModelsWithBLOBs record);

    List<VehicleModelsWithBLOBs> selectByExampleWithBLOBs(VehicleModelsExample example);

    List<VehicleModels> selectByExample(VehicleModelsExample example);

    int updateByExampleSelective(@Param("record") VehicleModelsWithBLOBs record, @Param("example") VehicleModelsExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleModelsWithBLOBs record, @Param("example") VehicleModelsExample example);

    int updateByExample(@Param("record") VehicleModels record, @Param("example") VehicleModelsExample example);
}