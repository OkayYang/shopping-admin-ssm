package com.admin.dao;

import com.admin.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2021-08-06
 */
@Repository
public interface AdminDao
{

    public List<Admin> selectAdminList(Admin admin);

    public List<Admin> selectAdminByLogin(Admin admin);
}