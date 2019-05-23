package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleBrands;
import com.sodacar.deer.dao.model.VehicleBrandsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleBrandsMapper {
    long countByExample(VehicleBrandsExample example);

    int deleteByExample(VehicleBrandsExample example);

    int insert(VehicleBrands record);

    int insertSelective(VehicleBrands record);

    List<VehicleBrands> selectByExampleWithBLOBs(VehicleBrandsExample example);

    List<VehicleBrands> selectByExample(VehicleBrandsExample example);

    int updateByExampleSelective(@Param("record") VehicleBrands record, @Param("example") VehicleBrandsExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleBrands record, @Param("example") VehicleBrandsExample example);

    int updateByExample(@Param("record") VehicleBrands record, @Param("example") VehicleBrandsExample example);
}