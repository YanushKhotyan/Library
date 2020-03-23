package com.htp.library.service;

import com.htp.library.service.impl.AdminServiceImpl;
import com.htp.library.service.impl.BookServiceImpl;
import com.htp.library.service.impl.UserServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private UserService userService = new UserServiceImpl();
    private BookService bookService = new BookServiceImpl();
    private AdminService adminService = new AdminServiceImpl();


    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public BookService getBookService() { return bookService;}

    public AdminService getAdminService(){return adminService;}

}
