package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Dealers;
import com.sodacar.deer.dao.model.DealersExample;
import com.sodacar.deer.dao.model.DealersWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealersMapper {
    long countByExample(DealersExample example);

    int deleteByExample(DealersExample example);

    int insert(DealersWithBLOBs record);

    int insertSelective(DealersWithBLOBs record);

    List<DealersWithBLOBs> selectByExampleWithBLOBs(DealersExample example);

    List<Dealers> selectByExample(DealersExample example);

    int updateByExampleSelective(@Param("record") DealersWithBLOBs record, @Param("example") DealersExample example);

    int updateByExampleWithBLOBs(@Param("record") DealersWithBLOBs record, @Param("example") DealersExample example);

    int updateByExample(@Param("record") Dealers record, @Param("example") DealersExample example);
}