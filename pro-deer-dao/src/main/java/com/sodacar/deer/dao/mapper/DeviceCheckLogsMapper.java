package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.DeviceCheckLogs;
import com.sodacar.deer.dao.model.DeviceCheckLogsExample;
import com.sodacar.deer.dao.model.DeviceCheckLogsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceCheckLogsMapper {
    long countByExample(DeviceCheckLogsExample example);

    int deleteByExample(DeviceCheckLogsExample example);

    int insert(DeviceCheckLogsWithBLOBs record);

    int insertSelective(DeviceCheckLogsWithBLOBs record);

    List<DeviceCheckLogsWithBLOBs> selectByExampleWithBLOBs(DeviceCheckLogsExample example);

    List<DeviceCheckLogs> selectByExample(DeviceCheckLogsExample example);

    int updateByExampleSelective(@Param("record") DeviceCheckLogsWithBLOBs record, @Param("example") DeviceCheckLogsExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceCheckLogsWithBLOBs record, @Param("example") DeviceCheckLogsExample example);

    int updateByExample(@Param("record") DeviceCheckLogs record, @Param("example") DeviceCheckLogsExample example);
}