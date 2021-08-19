package com.admin.dao;

import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface GoodDao {

    int countGood();

    Double totalSale();

    Double todaySale(String date);
}
