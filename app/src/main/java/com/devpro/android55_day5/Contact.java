package com.devpro.android55_day5;

public class Contact {
    private String userName;
    private String phoneNumber;
    private String avatar;

    public Contact(String avatar, String phoneNumber, String userName) {
        this.avatar = avatar;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public Contact() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "avatar='" + avatar + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
