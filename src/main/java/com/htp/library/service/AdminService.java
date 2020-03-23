package com.htp.library.service;

import com.htp.library.bean.Admin;

import java.io.IOException;

public interface AdminService {

    boolean addAdminRole(Admin admin) throws IOException;
}
