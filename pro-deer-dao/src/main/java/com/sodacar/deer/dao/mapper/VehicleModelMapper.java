package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleModel;
import com.sodacar.deer.dao.model.VehicleModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleModelMapper {
    long countByExample(VehicleModelExample example);

    int deleteByExample(VehicleModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VehicleModel record);

    int insertSelective(VehicleModel record);

    List<VehicleModel> selectByExampleWithBLOBs(VehicleModelExample example);

    List<VehicleModel> selectByExample(VehicleModelExample example);

    VehicleModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VehicleModel record, @Param("example") VehicleModelExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleModel record, @Param("example") VehicleModelExample example);

    int updateByExample(@Param("record") VehicleModel record, @Param("example") VehicleModelExample example);

    int updateByPrimaryKeySelective(VehicleModel record);

    int updateByPrimaryKeyWithBLOBs(VehicleModel record);

    int updateByPrimaryKey(VehicleModel record);
}