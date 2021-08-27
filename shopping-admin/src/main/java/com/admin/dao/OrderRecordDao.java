package com.admin.dao;

import com.admin.domain.OrderRecord;
import com.admin.domain.RecordUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRecordDao {
    /**
     * 批量删除【请填写功能名称】
     *
     * @param rids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRecordByRids(int[] rids);

    public List<OrderRecord> selectRecordList(OrderRecord orderRecord);
    public List<OrderRecord> selectRecordListByPage(@Param("page")int page, @Param("limit")int limit);
    public int countOrder();
}
