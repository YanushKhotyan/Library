package com.htp.library.dao;

import com.htp.library.bean.Book;
import com.htp.library.dao.impl.FileAdminDao;
import com.htp.library.dao.impl.FileLibrarianDao;
import com.htp.library.dao.impl.FileUserDao;

public class DaoProvider {
    private static final DaoProvider instance = new DaoProvider();

    private DaoProvider() {
    }

    private UserDao userDao = new FileUserDao();
    private AdminDao adminDao = new FileAdminDao();
    private LibrarianDao libraryDao = new FileLibrarianDao();

    public static DaoProvider getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public LibrarianDao getLibraryDao() {
        return libraryDao;
    }

    public AdminDao getAdminDao() {
        return adminDao;
    }
}
