package com.song.erp.mapper;

import com.song.erp.bean.DongErpUser;

public interface DongErpUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DongErpUser record);

    int insertSelective(DongErpUser record);

    DongErpUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DongErpUser record);

    int updateByPrimaryKey(DongErpUser record);
}