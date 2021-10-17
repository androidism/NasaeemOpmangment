package org.ismail.Moudel;

public class User{
    private String  email, pass;

    public User(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String phone) {
        this.email = phone;
    }
    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }
}
