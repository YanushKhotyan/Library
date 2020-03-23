package com.htp.library.service.impl;

import com.htp.library.bean.Book;
import com.htp.library.dao.DaoProvider;
import com.htp.library.dao.LibrarianDao;
import com.htp.library.service.BookService;

import java.io.IOException;

public class BookServiceImpl implements BookService {
    @Override
    public boolean addBook(Book book) throws IOException {
        boolean result;
        DaoProvider provider = DaoProvider.getInstance();
        LibrarianDao librarianDao = provider.getLibraryDao();
        result = librarianDao.addBook(book);
        return result;
    }
}
