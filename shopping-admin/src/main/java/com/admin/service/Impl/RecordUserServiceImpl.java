package com.admin.service.Impl;

import com.admin.dao.RecordUserDao;
import com.admin.dao.UserDao;
import com.admin.domain.RecordUser;
import com.admin.domain.User;
import com.admin.service.RecordUserService;
import com.admin.utils.DelUserData;
import com.admin.utils.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-08-26
 */
@Service
public class RecordUserServiceImpl implements RecordUserService
{
    @Autowired
    private RecordUserDao recordUserDao;

    @Autowired
    private UserDao userDao;
    /**
     * 查询【请填写功能名称】
     *
     * @param uid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public User selectRecordUserByUid(Long uid)
    {
        return recordUserDao.selectRecordUserByUid(uid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param recordUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public DelUserData selectRecordUserList(RecordUser recordUser)
    {
        DelUserData userData = new DelUserData();
        userData.setData(recordUserDao.selectRecordUserList(recordUser));
        userData.setCount(recordUserDao.countRecordUser());
        userData.setMsg("");
        userData.setCode(0);
        return userData;
    }
    @Override
    public DelUserData selectUserListByPage(int page, int limit){
        DelUserData userData = new DelUserData();
        userData.setData(recordUserDao.selectUserListByPage((page-1)*limit,limit));
        userData.setCount(recordUserDao.countRecordUser());
        userData.setMsg("");
        userData.setCode(0);
        return userData;
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param recordUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRecordUser(RecordUser recordUser)
    {
        return recordUserDao.insertRecordUser(recordUser);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param recordUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRecordUser(RecordUser recordUser)
    {
        return recordUserDao.updateRecordUser(recordUser);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param uids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRecordUserByUids(int[] uids)
    {
        return recordUserDao.deleteRecordUserByUids(uids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param uid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRecordUserByUid(Long uid)
    {
        return recordUserDao.deleteRecordUserByUid(uid);
    }

    @Override
    @Transactional
    public boolean recoverUser(Long uid)  {
        User user =null;
        user = recordUserDao.selectRecordUserByUid(uid);
        userDao.insertUser(user);
        recordUserDao.deleteRecordUserByUid(uid);
        return true;
    }
    @Override
    public int countRecordUser(){
        return recordUserDao.countRecordUser();
    }
}