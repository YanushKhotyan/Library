package com.htp.library.dao.impl;

import com.htp.library.bean.User;
import com.htp.library.dao.UserDao;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileUserDao implements UserDao {
    private StringBuffer result;

    @Override
    public boolean authorization(String login, String password) throws IOException {
        String result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/userData.txt"))) {
            String readLine = "";
            List<String> strList = new ArrayList<>();
            while ((readLine = reader.readLine()) != null) {
                strList.add(String.valueOf(Arrays.asList(readLine.split("\\s"))));
            }

            for (int i = 0; i < strList.size(); i++) {
                if (strList.get(i).contains(login) && strList.get(i).contains(password)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean registration(User user) throws IOException {

        FileWriter userData = new FileWriter("src/main/resources/userData.txt", true);
        try (BufferedWriter bufferedWriter = new BufferedWriter(userData)) {

            String userRegistrationData = user.getId() + " " + user.getName() + " "
                    + user.getSurname() + " " + user.getLogin() + " "
                    + user.getPassword() + '\n';
            bufferedWriter.write(userRegistrationData);
        } catch (IOException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean changePassword(String login, String password, String newPassword) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/userData.txt"))) {
            FileWriter userData = new FileWriter("src/main/resources/userData.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(userData);
            String readLine = "";
            List<String> strList = new ArrayList<>();
            while ((readLine = reader.readLine()) != null) {
                strList.add(String.valueOf(Arrays.asList(readLine.split("\\s"))));
            }

            for (int i = 0; i < strList.size(); i++) {
                if (strList.get(i).contains(login) &&strList.get(i).contains(password)) {
                    bufferedWriter.write(strList.get(i).replaceAll(password, newPassword));
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}

