package com.htp.library.controller.impl;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;
import com.htp.library.bean.User;
import com.htp.library.controller.Command;
import com.htp.library.service.ServiceProvider;
import com.htp.library.service.UserService;

public class RegistrationCommand implements Command {
    @Override
    public String execute(User request) {
        String response = "";
        UserService service = ServiceProvider.getInstance().getUserService();
        try {
            if(!service.registration(request)){
                response = "User has been registered. User id is: " + request.getId();
            }else{
                response = "Неа, что-то пошло не так";
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
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
