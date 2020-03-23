package com.htp.library.dao.impl;

import com.htp.library.bean.Book;
import com.htp.library.dao.LibrarianDao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLibrarianDao implements LibrarianDao {
    @Override
    public boolean addBook(Book book) throws IOException {
        FileWriter userData = new FileWriter("src/main/resources/book.txt", true);
        try (BufferedWriter bufferedWriter = new BufferedWriter(userData)) {

            String bookData = book.getId() + " " + book.getName() + " " + book.getLike() + '\n';

            bufferedWriter.write(bookData);
        } catch (IOException e) {
            System.out.println(e);
        }
        return false;
    }
}
