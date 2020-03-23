package com.htp.library.controller.impl;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;
import com.htp.library.bean.User;
import com.htp.library.controller.Command;
import com.htp.library.service.BookService;
import com.htp.library.service.ServiceProvider;

import java.io.IOException;

public class AddNewBookCommand implements Command {
    @Override
    public String execute(User request) {
        return null;
    }

    @Override
    public String execute(Admin request) {
        return null;
    }

    @Override
    public String execute(Book book) {
        String response;
        BookService service = ServiceProvider.getInstance().getBookService();
        try {
            if (!service.addBook(book)){
                response = "Book has been added";
            }else{
                response = "Book has not been added";
            }
        } catch (Exception e) {
            response = "error";
        }
        return response;
    }
}
