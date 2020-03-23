package com.htp.library;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;
import com.htp.library.bean.User;
import com.htp.library.controller.Controller;

public class Starter {

    private static long idCounter = 0;

    private static String generateId() {
        return String.valueOf((int) (Math.random() * (200 + 1)));
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        String request;
        String response;

        User user = new User(generateId(), "exe@gmail.com", "Qwerty1", "Linux", "Mac");

        request = "registration";

        response = controller.action(user, request);
        System.out.println(response);
        user = null;
        request = null;

        user = new User("exe@gmail.com", "Qwerty1");

        request = "authorization";

        response = controller.action(user, request);
        System.out.println(response);

        request = "add_new_book";

        Book book = new Book(generateId(), "book1", 1);
        response = controller.action(book, request);
        System.out.println(response);

        request = "change_password";

        user = new User("exe@gmail.com", "Qwerty1", "Esad213W");
        response = controller.action(user, request);
        System.out.println(response);

        request = "admin_role";

        Admin admin = new Admin(generateId(), "admin@admin.by", "Qwerty1234", new String[]{"addBook", "removeBook"});
        response = controller.action(admin, request);
    }
}
