package com.templateproject.api.controller.payload;

public class UserRegister {

    private String username;
    private String email;
    private String password;
    private String cpassword;

    public UserRegister() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    @Override
    public String toString() {
        return "UserRegister{" +
                "login='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cpassword='" + cpassword + '\'' +
                '}';
    }

}
