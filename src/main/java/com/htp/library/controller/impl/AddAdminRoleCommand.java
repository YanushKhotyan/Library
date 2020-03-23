package com.htp.library.controller.impl;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;
import com.htp.library.bean.User;
import com.htp.library.controller.Command;
import com.htp.library.service.AdminService;

import com.htp.library.service.ServiceProvider;

public class AddAdminRoleCommand implements Command {
    @Override
    public String execute(User request) {
        return null;
    }

    @Override
    public String execute(Admin admin) {
        String response;
        AdminService service = ServiceProvider.getInstance().getAdminService();
        try {
            if (!service.addAdminRole(admin)){
                response = "Admin and role has been create";
            }else{
                response = "Admin and role has not been create";
            }
        } catch (Exception e) {
            response = "error";
        }
        return response;
    }

    @Override
    public String execute(Book request) {
        return null;
    }
}
