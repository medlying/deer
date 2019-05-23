package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Device;
import com.sodacar.deer.dao.model.DeviceExample;
import com.sodacar.deer.dao.model.DeviceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {
    long countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(DeviceWithBLOBs record);

    int insertSelective(DeviceWithBLOBs record);

    List<DeviceWithBLOBs> selectByExampleWithBLOBs(DeviceExample example);

    List<Device> selectByExample(DeviceExample example);

    DeviceWithBLOBs selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") DeviceWithBLOBs record, @Param("example") DeviceExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceWithBLOBs record, @Param("example") DeviceExample example);

    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByPrimaryKeySelective(DeviceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DeviceWithBLOBs record);

    int updateByPrimaryKey(Device record);
}