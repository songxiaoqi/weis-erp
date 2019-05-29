package com.song.erp.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.erp.bean.DongErpUser;
import com.song.erp.mapper.DongErpUserMapper;
import com.song.erp.service.DongErpUserService;

@Service("dongErpUserService")
public class DongErpUserServiceImpl implements DongErpUserService {


    @Autowired
    private DongErpUserMapper dongErpUserMapper;


    @Override
    public DongErpUser selectByPrimaryKey(Long id) {
        return dongErpUserMapper.selectByPrimaryKey(id);
    }

}
