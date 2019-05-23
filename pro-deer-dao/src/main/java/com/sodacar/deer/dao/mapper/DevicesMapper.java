package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Devices;
import com.sodacar.deer.dao.model.DevicesExample;
import com.sodacar.deer.dao.model.DevicesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevicesMapper {
    long countByExample(DevicesExample example);

    int deleteByExample(DevicesExample example);

    int insert(DevicesWithBLOBs record);

    int insertSelective(DevicesWithBLOBs record);

    List<DevicesWithBLOBs> selectByExampleWithBLOBs(DevicesExample example);

    List<Devices> selectByExample(DevicesExample example);

    int updateByExampleSelective(@Param("record") DevicesWithBLOBs record, @Param("example") DevicesExample example);

    int updateByExampleWithBLOBs(@Param("record") DevicesWithBLOBs record, @Param("example") DevicesExample example);

    int updateByExample(@Param("record") Devices record, @Param("example") DevicesExample example);
}