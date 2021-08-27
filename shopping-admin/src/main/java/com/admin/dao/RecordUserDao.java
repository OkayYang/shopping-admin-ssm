package com.admin.dao;

import com.admin.domain.RecordUser;
import com.admin.domain.User;
import com.admin.utils.DelUserData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2021-08-26
 */
@Repository
public interface RecordUserDao
{
    /**
     * 查询【请填写功能名称】
     *
     * @param uid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public User selectRecordUserByUid(Long uid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param recordUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RecordUser> selectRecordUserList(RecordUser recordUser);
    public List<RecordUser> selectUserListByPage(@Param("page")int page, @Param("limit")int limit);

    /**
     * 新增【请填写功能名称】
     *
     * @param recordUser 【请填写功能名称】
     * @return 结果
     */
    public int insertRecordUser(RecordUser recordUser);

    /**
     * 修改【请填写功能名称】
     *
     * @param recordUser 【请填写功能名称】
     * @return 结果
     */
    public int updateRecordUser(RecordUser recordUser);

    /**
     * 删除【请填写功能名称】
     *
     * @param uid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRecordUserByUid(Long uid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param uids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRecordUserByUids(int[] uids);

    public int countRecordUser();
}