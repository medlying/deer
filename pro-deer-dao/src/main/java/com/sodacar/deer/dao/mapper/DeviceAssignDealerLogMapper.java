package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.DeviceAssignDealerLog;
import com.sodacar.deer.dao.model.DeviceAssignDealerLogExample;
import com.sodacar.deer.dao.model.DeviceAssignDealerLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceAssignDealerLogMapper {
    long countByExample(DeviceAssignDealerLogExample example);

    int deleteByExample(DeviceAssignDealerLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceAssignDealerLogWithBLOBs record);

    int insertSelective(DeviceAssignDealerLogWithBLOBs record);

    List<DeviceAssignDealerLogWithBLOBs> selectByExampleWithBLOBs(DeviceAssignDealerLogExample example);

    List<DeviceAssignDealerLog> selectByExample(DeviceAssignDealerLogExample example);

    DeviceAssignDealerLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceAssignDealerLogWithBLOBs record, @Param("example") DeviceAssignDealerLogExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceAssignDealerLogWithBLOBs record, @Param("example") DeviceAssignDealerLogExample example);

    int updateByExample(@Param("record") DeviceAssignDealerLog record, @Param("example") DeviceAssignDealerLogExample example);

    int updateByPrimaryKeySelective(DeviceAssignDealerLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DeviceAssignDealerLogWithBLOBs record);

    int updateByPrimaryKey(DeviceAssignDealerLog record);
}