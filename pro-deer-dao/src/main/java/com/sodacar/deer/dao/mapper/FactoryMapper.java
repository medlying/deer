package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Factory;
import com.sodacar.deer.dao.model.FactoryExample;
import com.sodacar.deer.dao.model.FactoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryMapper {
    long countByExample(FactoryExample example);

    int deleteByExample(FactoryExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(FactoryWithBLOBs record);

    int insertSelective(FactoryWithBLOBs record);

    List<FactoryWithBLOBs> selectByExampleWithBLOBs(FactoryExample example);

    List<Factory> selectByExample(FactoryExample example);

    FactoryWithBLOBs selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") FactoryWithBLOBs record, @Param("example") FactoryExample example);

    int updateByExampleWithBLOBs(@Param("record") FactoryWithBLOBs record, @Param("example") FactoryExample example);

    int updateByExample(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByPrimaryKeySelective(FactoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FactoryWithBLOBs record);

    int updateByPrimaryKey(Factory record);
}