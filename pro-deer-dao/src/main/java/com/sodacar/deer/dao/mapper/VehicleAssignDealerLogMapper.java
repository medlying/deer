package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleAssignDealerLog;
import com.sodacar.deer.dao.model.VehicleAssignDealerLogExample;
import com.sodacar.deer.dao.model.VehicleAssignDealerLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleAssignDealerLogMapper {
    long countByExample(VehicleAssignDealerLogExample example);

    int deleteByExample(VehicleAssignDealerLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VehicleAssignDealerLogWithBLOBs record);

    int insertSelective(VehicleAssignDealerLogWithBLOBs record);

    List<VehicleAssignDealerLogWithBLOBs> selectByExampleWithBLOBs(VehicleAssignDealerLogExample example);

    List<VehicleAssignDealerLog> selectByExample(VehicleAssignDealerLogExample example);

    VehicleAssignDealerLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VehicleAssignDealerLogWithBLOBs record, @Param("example") VehicleAssignDealerLogExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleAssignDealerLogWithBLOBs record, @Param("example") VehicleAssignDealerLogExample example);

    int updateByExample(@Param("record") VehicleAssignDealerLog record, @Param("example") VehicleAssignDealerLogExample example);

    int updateByPrimaryKeySelective(VehicleAssignDealerLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VehicleAssignDealerLogWithBLOBs record);

    int updateByPrimaryKey(VehicleAssignDealerLog record);
}