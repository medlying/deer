package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleCheckLog;
import com.sodacar.deer.dao.model.VehicleCheckLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleCheckLogMapper {
    long countByExample(VehicleCheckLogExample example);

    int deleteByExample(VehicleCheckLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VehicleCheckLog record);

    int insertSelective(VehicleCheckLog record);

    List<VehicleCheckLog> selectByExampleWithBLOBs(VehicleCheckLogExample example);

    List<VehicleCheckLog> selectByExample(VehicleCheckLogExample example);

    VehicleCheckLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VehicleCheckLog record, @Param("example") VehicleCheckLogExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleCheckLog record, @Param("example") VehicleCheckLogExample example);

    int updateByExample(@Param("record") VehicleCheckLog record, @Param("example") VehicleCheckLogExample example);

    int updateByPrimaryKeySelective(VehicleCheckLog record);

    int updateByPrimaryKeyWithBLOBs(VehicleCheckLog record);

    int updateByPrimaryKey(VehicleCheckLog record);
}