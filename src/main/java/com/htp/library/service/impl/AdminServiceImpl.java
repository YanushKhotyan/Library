package com.htp.library.service.impl;

import com.htp.library.bean.Admin;
import com.htp.library.dao.AdminDao;
import com.htp.library.dao.DaoProvider;
import com.htp.library.dao.UserDao;
import com.htp.library.service.AdminService;

import java.io.IOException;

public class AdminServiceImpl implements AdminService {
    @Override
    public boolean addAdminRole(Admin admin) throws IOException {
        boolean result;
        DaoProvider provider = DaoProvider.getInstance();
        AdminDao adminDao = provider.getAdminDao();
        result = adminDao.addRole(admin);
        return result;
    }
}
