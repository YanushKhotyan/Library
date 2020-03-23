package com.htp.library.service;

import com.htp.library.bean.Admin;
import com.htp.library.bean.Book;

import java.io.IOException;

public interface BookService {
    boolean addBook(Book book) throws IOException;
}
