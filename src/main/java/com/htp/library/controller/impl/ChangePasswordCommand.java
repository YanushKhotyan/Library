package com.htp.library.controller.impl;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;
import com.htp.library.bean.User;
import com.htp.library.controller.Command;
import com.htp.library.service.ServiceProvider;
import com.htp.library.service.UserService;

import java.io.IOException;

public class ChangePasswordCommand implements Command {
    @Override
    public String execute(User user) {
        String response;
        UserService service = ServiceProvider.getInstance().getUserService();
        try {
            if (!service.changePassword(user)){
                response = "User password has been changed";
            }else{
                response = "User password has not been changed";
            }
        } catch (Exception e) {
            response = "error";
        }
        return response;
    }

    @Override
    public String execute(Admin request) {
        return null;
    }

    @Override
    public String execute(Book request) {
        return null;
    }
}
