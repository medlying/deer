package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleModel;
import com.sodacar.deer.dao.model.VehicleModelExample;
import com.sodacar.deer.dao.model.VehicleModelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleModelMapper {
    long countByExample(VehicleModelExample example);

    int deleteByExample(VehicleModelExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(VehicleModelWithBLOBs record);

    int insertSelective(VehicleModelWithBLOBs record);

    List<VehicleModelWithBLOBs> selectByExampleWithBLOBs(VehicleModelExample example);

    List<VehicleModel> selectByExample(VehicleModelExample example);

    VehicleModelWithBLOBs selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") VehicleModelWithBLOBs record, @Param("example") VehicleModelExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleModelWithBLOBs record, @Param("example") VehicleModelExample example);

    int updateByExample(@Param("record") VehicleModel record, @Param("example") VehicleModelExample example);

    int updateByPrimaryKeySelective(VehicleModelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VehicleModelWithBLOBs record);

    int updateByPrimaryKey(VehicleModel record);
}