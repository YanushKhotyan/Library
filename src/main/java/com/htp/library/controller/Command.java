package com.htp.library.controller;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;
import com.htp.library.bean.User;

public interface Command {
    String execute(User request);
    String execute(Admin request);
    String execute(Book request);

}
