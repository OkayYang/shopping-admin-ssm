package com.admin.service.Impl;

import com.admin.dao.UserDao;
import com.admin.domain.User;
import com.admin.service.UserService;
import java.util.List;

import com.admin.utils.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-08-12
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    /**
     * 查询【请填写功能名称】
     *
     * @param uid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public User selectUserByUid(Long uid)
    {
        return userDao.selectUserByUid(uid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param user 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public UserData selectUserList(User user)
    {
        UserData userData = new UserData();
        userData.setData(userDao.selectUserList(user));
        userData.setCount(userDao.countUser());
        userData.setMsg("");
        userData.setCode(0);
        return userData;
    }
    @Override
    public UserData selectUserListByPage(int page,int limit){
        UserData userData = new UserData();
        userData.setData(userDao.selectUserListByPage((page-1)*limit,page*limit));
        userData.setCount(userDao.countUser());
        userData.setMsg("");
        userData.setCode(0);
        return userData;
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param user 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        return userDao.insertUser(user);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param user 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        return userDao.updateUser(user);
    }


    /**
     * 删除【请填写功能名称】信息
     *
     * @param uid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserByUid(Long uid)
    {
        return userDao.deleteUserByUid(uid);
    }

    @Override
    public int countUser(){
        return userDao.countUser();
    }
}