package com.htp.library.dao;

import com.htp.library.bean.User;

import java.io.IOException;

public interface UserDao {
    boolean authorization(String login, String password) throws IOException;
    boolean registration(User user) throws IOException;
    boolean changePassword(String login, String password, String newPassword) throws IOException;

}
