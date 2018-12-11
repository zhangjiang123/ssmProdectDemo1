package com.zhang.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface BrandDao {

    String queryById(String id);

}
