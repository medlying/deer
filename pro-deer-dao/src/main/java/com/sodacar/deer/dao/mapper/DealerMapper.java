package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Dealer;
import com.sodacar.deer.dao.model.DealerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerMapper {
    long countByExample(DealerExample example);

    int deleteByExample(DealerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dealer record);

    int insertSelective(Dealer record);

    List<Dealer> selectByExample(DealerExample example);

    Dealer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Dealer record, @Param("example") DealerExample example);

    int updateByExample(@Param("record") Dealer record, @Param("example") DealerExample example);

    int updateByPrimaryKeySelective(Dealer record);

    int updateByPrimaryKey(Dealer record);
}