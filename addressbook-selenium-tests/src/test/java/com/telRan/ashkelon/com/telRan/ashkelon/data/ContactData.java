package com.telRan.ashkelon.com.telRan.ashkelon.data;

public class ContactData {
    private String fName;
    private String lName;
    private String address;
    private String email;
    private String phoneHome;

    public ContactData withfName(String fName) {
        this.fName = fName;
        return this;
    }

    public ContactData withlName(String lName) {
        this.lName = lName;
        return this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData withEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactData withPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
        return this;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneHome() {
        return phoneHome;
    }
}
