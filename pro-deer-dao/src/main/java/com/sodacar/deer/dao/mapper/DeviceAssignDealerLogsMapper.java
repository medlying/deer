package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.DeviceAssignDealerLogs;
import com.sodacar.deer.dao.model.DeviceAssignDealerLogsExample;
import com.sodacar.deer.dao.model.DeviceAssignDealerLogsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceAssignDealerLogsMapper {
    long countByExample(DeviceAssignDealerLogsExample example);

    int deleteByExample(DeviceAssignDealerLogsExample example);

    int insert(DeviceAssignDealerLogsWithBLOBs record);

    int insertSelective(DeviceAssignDealerLogsWithBLOBs record);

    List<DeviceAssignDealerLogsWithBLOBs> selectByExampleWithBLOBs(DeviceAssignDealerLogsExample example);

    List<DeviceAssignDealerLogs> selectByExample(DeviceAssignDealerLogsExample example);

    int updateByExampleSelective(@Param("record") DeviceAssignDealerLogsWithBLOBs record, @Param("example") DeviceAssignDealerLogsExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceAssignDealerLogsWithBLOBs record, @Param("example") DeviceAssignDealerLogsExample example);

    int updateByExample(@Param("record") DeviceAssignDealerLogs record, @Param("example") DeviceAssignDealerLogsExample example);
}