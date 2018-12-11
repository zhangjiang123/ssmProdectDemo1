package com.zhang.service.impl;

import com.zhang.dao.BrandDao;
import com.zhang.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandDao brandDao;

    public String getBrandName(String id) {

        return brandDao.queryById(id);
    }
}
