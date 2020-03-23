package com.htp.library.bean;

import java.util.Arrays;
import java.util.Objects;

public class Admin{
    private String id;
    private String login;
    private String password;
    private String [] role;

    public Admin(String id, String login, String password, String[] role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id) &&
                Objects.equals(login, admin.login) &&
                Objects.equals(password, admin.password) &&
                Arrays.equals(role, admin.role);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, login, password);
        result = 31 * result + Arrays.hashCode(role);
        return result;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + Arrays.toString(role) +
                '}';
    }
}
