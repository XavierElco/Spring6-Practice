package com.xav.pojo;

public class Clazz {
    private String cid;
    private String cname;

    // 本次案例省去getter和setter方法，用构造注入
    public Clazz() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Clazz(String cid, String cname) {
        System.out.println("Class的有参构造器");
        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
