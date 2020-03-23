package com.htp.library.service.impl;

import com.htp.library.bean.User;
import com.htp.library.dao.DaoProvider;
import com.htp.library.dao.UserDao;
import com.htp.library.service.UserService;

import java.io.IOException;

public class UserServiceImpl implements UserService {
    @Override
    public boolean authorization(User user) throws IOException {
        DaoProvider provider = DaoProvider.getInstance();
        UserDao userDao = provider.getUserDao();
        boolean result;
        result = userDao.authorization(user.getLogin(), user.getPassword());
        return result;
    }

    @Override
    public boolean registration(User user) throws IOException {
        String password = user.getPassword();
        if (check(password)) {
        } else {
            System.out.println("Ошибка");
            return false;
        }

        boolean result;
        DaoProvider provider = DaoProvider.getInstance();
        UserDao userDao = provider.getUserDao();
        result = userDao.registration(user);
        return result;
    }

    @Override
    public boolean like(User user) {
        return false;
    }

    @Override
    public boolean changePassword(User user) throws IOException {
        DaoProvider provider = DaoProvider.getInstance();
        UserDao userDao = provider.getUserDao();
        boolean result;
        result = userDao.changePassword(user.getLogin(), user.getPassword(), user.getNewPassword());
        return result;

    }

    private boolean check(String password) {
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());

        if (password.length() < 6) {
            throw new RuntimeException("Пароль меньше 6-ти символов");
        } else if (!hasUppercase) {
            throw new RuntimeException("Хотябы один из симвалов должен быть в аперкейсе");
        } else if (!hasLowercase) {
            throw new RuntimeException("Хотябы один из симвалов должен быть в лоукейсе");
        }
        return true;
    }
}
