package com.xav.pojo;

public class Clazz {
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Clazz() {
    }

    public Clazz(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
