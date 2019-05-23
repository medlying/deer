package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.VehicleAssignDealerLogs;
import com.sodacar.deer.dao.model.VehicleAssignDealerLogsExample;
import com.sodacar.deer.dao.model.VehicleAssignDealerLogsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleAssignDealerLogsMapper {
    long countByExample(VehicleAssignDealerLogsExample example);

    int deleteByExample(VehicleAssignDealerLogsExample example);

    int insert(VehicleAssignDealerLogsWithBLOBs record);

    int insertSelective(VehicleAssignDealerLogsWithBLOBs record);

    List<VehicleAssignDealerLogsWithBLOBs> selectByExampleWithBLOBs(VehicleAssignDealerLogsExample example);

    List<VehicleAssignDealerLogs> selectByExample(VehicleAssignDealerLogsExample example);

    int updateByExampleSelective(@Param("record") VehicleAssignDealerLogsWithBLOBs record, @Param("example") VehicleAssignDealerLogsExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleAssignDealerLogsWithBLOBs record, @Param("example") VehicleAssignDealerLogsExample example);

    int updateByExample(@Param("record") VehicleAssignDealerLogs record, @Param("example") VehicleAssignDealerLogsExample example);
}