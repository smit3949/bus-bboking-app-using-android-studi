package com.example.bus.model;

public class Contact {
    private int id;
    private String name;
    private String phoneno;
    private String add;
    private String email;

    public Contact(String name, String phoneno, String add, String email) {
        this.name = name;
        this.phoneno = phoneno;
        this.add = add;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getAdd() {
        return add;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
