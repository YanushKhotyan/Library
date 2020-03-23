package com.htp.library.dao.impl;

import com.htp.library.bean.Admin;
import com.htp.library.dao.AdminDao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileAdminDao implements AdminDao {

    @Override
    public boolean addRole(Admin admin) throws IOException {
        FileWriter userData = new FileWriter("src/main/resources/adminData.txt", true);
        try (BufferedWriter bufferedWriter = new BufferedWriter(userData)) {

            String userRegistrationData = admin.getId() + " " + admin.getLogin() + " "
                    + admin.getPassword() + " " + Arrays.toString(admin.getRole()) + '\n';
            bufferedWriter.write(userRegistrationData);
        } catch (IOException e) {
            System.out.println(e);
        }
        return false;
    }
}
