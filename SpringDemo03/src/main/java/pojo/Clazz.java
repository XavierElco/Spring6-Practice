package pojo;

public class Clazz {
    private int cid;
    private String cname;

    // 本次案例省去getter和setter方法，用构造注入
    public Clazz() {
    }

    public Clazz(int cid, String cname) {
        System.out.println("Class的有参构造器");
        this.cid = cid;
        this.cname = cname;
    }
}
