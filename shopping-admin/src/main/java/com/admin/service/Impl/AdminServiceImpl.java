package com.admin.service.Impl;

import java.util.List;

import com.admin.dao.AdminDao;
import com.admin.domain.Admin;
import com.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-08-06
 */
@Service
public class AdminServiceImpl implements AdminService
{
    @Autowired
    private AdminDao adminDao;


    @Override
    public List<Admin> selectAdminList(Admin admin)
    {
        return adminDao.selectAdminList(admin);
    }

    @Override
    public List<Admin> selectAdminByLogin(Admin admin){
        return adminDao.selectAdminByLogin(admin);
    }
}