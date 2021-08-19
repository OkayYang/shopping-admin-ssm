package com.admin.service.Impl;

import com.admin.dao.GoodDao;
import com.admin.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    GoodDao goodDao;

    @Override
    public int countGood() {
        return goodDao.countGood();
    }

    @Override
    public Double totalSale() {
        return goodDao.totalSale();
    }

    @Override
    public Double todaySale() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd%");
        return goodDao.todaySale(df.format(new Date()));
    }
}
