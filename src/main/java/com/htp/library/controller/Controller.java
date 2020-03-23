package com.htp.library.controller;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;
import com.htp.library.bean.User;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String action(User user, String request) {
        String response;
        Command command;

        command = provider.getCommand(request.toUpperCase());
        response = command.execute(user);

        return response;
    }

    public String action(Book book, String request) {
        String response;
        Command command;

        command = provider.getCommand(request.toUpperCase());
        response = command.execute(book);

        return response;
    }

    public String action(Admin admin, String request) {
        String response;
        Command command;

        command = provider.getCommand(request.toUpperCase());
        response = command.execute(admin);

        return response;
    }
}
