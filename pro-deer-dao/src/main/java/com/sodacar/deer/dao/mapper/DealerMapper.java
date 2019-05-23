package com.sodacar.deer.dao.mapper;

import com.sodacar.deer.dao.model.Dealer;
import com.sodacar.deer.dao.model.DealerExample;
import com.sodacar.deer.dao.model.DealerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerMapper {
    long countByExample(DealerExample example);

    int deleteByExample(DealerExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(DealerWithBLOBs record);

    int insertSelective(DealerWithBLOBs record);

    List<DealerWithBLOBs> selectByExampleWithBLOBs(DealerExample example);

    List<Dealer> selectByExample(DealerExample example);

    DealerWithBLOBs selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") DealerWithBLOBs record, @Param("example") DealerExample example);

    int updateByExampleWithBLOBs(@Param("record") DealerWithBLOBs record, @Param("example") DealerExample example);

    int updateByExample(@Param("record") Dealer record, @Param("example") DealerExample example);

    int updateByPrimaryKeySelective(DealerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DealerWithBLOBs record);

    int updateByPrimaryKey(Dealer record);
}