package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleCheckLog;
import com.sodacar.deer.dao.model.VehicleCheckLogExample;
import com.sodacar.deer.dao.model.VehicleCheckLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleCheckLogMapper {
    long countByExample(VehicleCheckLogExample example);

    int deleteByExample(VehicleCheckLogExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(VehicleCheckLogWithBLOBs record);

    int insertSelective(VehicleCheckLogWithBLOBs record);

    List<VehicleCheckLogWithBLOBs> selectByExampleWithBLOBs(VehicleCheckLogExample example);

    List<VehicleCheckLog> selectByExample(VehicleCheckLogExample example);

    VehicleCheckLogWithBLOBs selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") VehicleCheckLogWithBLOBs record, @Param("example") VehicleCheckLogExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleCheckLogWithBLOBs record, @Param("example") VehicleCheckLogExample example);

    int updateByExample(@Param("record") VehicleCheckLog record, @Param("example") VehicleCheckLogExample example);

    int updateByPrimaryKeySelective(VehicleCheckLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VehicleCheckLogWithBLOBs record);

    int updateByPrimaryKey(VehicleCheckLog record);
}