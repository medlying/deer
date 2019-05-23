package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Vehicle;
import com.sodacar.deer.dao.model.VehicleExample;
import com.sodacar.deer.dao.model.VehicleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleMapper {
    long countByExample(VehicleExample example);

    int deleteByExample(VehicleExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(VehicleWithBLOBs record);

    int insertSelective(VehicleWithBLOBs record);

    List<VehicleWithBLOBs> selectByExampleWithBLOBs(VehicleExample example);

    List<Vehicle> selectByExample(VehicleExample example);

    VehicleWithBLOBs selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") VehicleWithBLOBs record, @Param("example") VehicleExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleWithBLOBs record, @Param("example") VehicleExample example);

    int updateByExample(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    int updateByPrimaryKeySelective(VehicleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VehicleWithBLOBs record);

    int updateByPrimaryKey(Vehicle record);
}