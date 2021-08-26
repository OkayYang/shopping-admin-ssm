package com.admin.service;

import com.admin.domain.RecordUser;
import com.admin.domain.User;
import com.admin.utils.DelUserData;
import com.admin.utils.UserData;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2021-08-26
 */
public interface RecordUserService
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
    public DelUserData selectRecordUserList(RecordUser recordUser);
    public DelUserData selectUserListByPage(int page, int limit);

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
     * 批量删除【请填写功能名称】
     *
     * @param uids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteRecordUserByUids(int[] uids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param uid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRecordUserByUid(Long uid);

    public boolean recoverUser(Long uid) throws Exception;
}