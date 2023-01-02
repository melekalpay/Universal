package com.uniyaz.collection;

import java.util.Objects;

public class Rehber {


    private String name;
    private String phone;
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rehber() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rehber rehber = (Rehber) o;
        return Objects.equals(name, rehber.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
