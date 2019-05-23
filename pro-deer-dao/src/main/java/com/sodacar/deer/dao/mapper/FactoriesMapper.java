package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Factories;
import com.sodacar.deer.dao.model.FactoriesExample;
import com.sodacar.deer.dao.model.FactoriesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoriesMapper {
    long countByExample(FactoriesExample example);

    int deleteByExample(FactoriesExample example);

    int insert(FactoriesWithBLOBs record);

    int insertSelective(FactoriesWithBLOBs record);

    List<FactoriesWithBLOBs> selectByExampleWithBLOBs(FactoriesExample example);

    List<Factories> selectByExample(FactoriesExample example);

    int updateByExampleSelective(@Param("record") FactoriesWithBLOBs record, @Param("example") FactoriesExample example);

    int updateByExampleWithBLOBs(@Param("record") FactoriesWithBLOBs record, @Param("example") FactoriesExample example);

    int updateByExample(@Param("record") Factories record, @Param("example") FactoriesExample example);
}