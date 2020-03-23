package com.htp.library.dao;

import com.htp.library.bean.Book;

import java.io.IOException;

public interface LibrarianDao {
    boolean addBook(Book book) throws IOException;
}
