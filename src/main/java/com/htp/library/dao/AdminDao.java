package com.htp.library.dao;

import com.htp.library.bean.Admin;

import java.io.IOException;

public interface AdminDao {
    boolean addRole(Admin admin) throws IOException;
}
