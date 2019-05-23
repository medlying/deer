package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Vehicles;
import com.sodacar.deer.dao.model.VehiclesExample;
import com.sodacar.deer.dao.model.VehiclesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehiclesMapper {
    long countByExample(VehiclesExample example);

    int deleteByExample(VehiclesExample example);

    int insert(VehiclesWithBLOBs record);

    int insertSelective(VehiclesWithBLOBs record);

    List<VehiclesWithBLOBs> selectByExampleWithBLOBs(VehiclesExample example);

    List<Vehicles> selectByExample(VehiclesExample example);

    int updateByExampleSelective(@Param("record") VehiclesWithBLOBs record, @Param("example") VehiclesExample example);

    int updateByExampleWithBLOBs(@Param("record") VehiclesWithBLOBs record, @Param("example") VehiclesExample example);

    int updateByExample(@Param("record") Vehicles record, @Param("example") VehiclesExample example);
}