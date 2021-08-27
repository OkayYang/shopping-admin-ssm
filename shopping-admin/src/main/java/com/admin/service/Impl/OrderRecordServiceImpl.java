package com.admin.service.Impl;

import com.admin.dao.OrderRecordDao;
import com.admin.domain.OrderRecord;
import com.admin.service.OrderRecordService;
import com.admin.utils.DelUserData;
import com.admin.utils.OrderRecordData;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderRecordServiceImpl implements OrderRecordService {

    @Autowired
    private OrderRecordDao orderRecordDao;
    @Override
    public int deleteRecordByRids(int[] rids) {
        return orderRecordDao.deleteRecordByRids(rids);
    }

    @Override
    public OrderRecordData selectRecordList(OrderRecord orderRecord) {
        OrderRecordData orderRecordData = new OrderRecordData();
        orderRecordData.setData(orderRecordDao.selectRecordList(orderRecord));
        orderRecordData.setCount(orderRecordDao.countOrder());
        orderRecordData.setCode(0);
        orderRecordData.setMsg("");
        return orderRecordData;
    }
    @Override
    public OrderRecordData selectRecordListByPage(int page,int limit){
        OrderRecordData orderRecordData = new OrderRecordData();
        orderRecordData.setData(orderRecordDao.selectRecordListByPage((page-1)*limit,limit));
        orderRecordData.setCount(orderRecordDao.countOrder());
        orderRecordData.setCode(0);
        orderRecordData.setMsg("");
        return orderRecordData;
    }
}
