package com.htp.library.service;

import com.htp.library.bean.User;

import java.io.IOException;

public interface UserService{
    boolean authorization(User user) throws IOException;
    boolean registration(User user) throws IOException;
    boolean like(User user);
    boolean changePassword(User user) throws IOException;
}
