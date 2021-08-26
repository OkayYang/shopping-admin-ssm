package com.admin.service.Impl;

import com.admin.dao.GoodDao;
import com.admin.domain.Good;
import com.admin.service.GoodService;
import com.admin.utils.GoodData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    GoodDao goodDao;

    @Override
    public GoodData selectGoodsByPage(int page,int limit)
    {
        GoodData goodData = new GoodData();
        goodData.setData(goodDao.selectGoodsListByPage((page-1)*limit,limit));
        goodData.setMsg("");
        goodData.setCode(0);
        goodData.setCount(goodDao.countGood());
        return goodData;
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param goods 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public GoodData selectGoodsList(Good goods)
    {
        GoodData goodData = new GoodData();
        goodData.setMsg("");
        goodData.setCode(0);
        goodData.setCount(goodDao.countGood());
        goodData.setData(goodDao.selectGoodsList(goods));
        return goodData;
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param goods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertGoods(Good goods)
    {
        return goodDao.insertGoods(goods);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param goods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateGoods(Good goods)
    {
        return goodDao.updateGoods(goods);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteGoodsByIds(int[] ids)
    {
        return goodDao.deleteGoodsByIds(ids);
    }
    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteGoodsById(Long id)
    {
        return goodDao.deleteGoodsById(id);
    }

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
