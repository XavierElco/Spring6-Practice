package com.xav.proxydemo;

public class HouseProxy implements Rent{
    private Host host;

    // 构造器
    public HouseProxy(Host host) {
        this.host = host;
    }

    @Override
    public Object rentHouse(double money) {
        // 看房子
        lookHouse();

        // 讨价还价
        negotiate(money);
        // 赚差价
        earnMoney(money);

        // 签合同（房东的房子）
        signContract();

        Object house = host.rentHouse(money*0.8);

        // 定期保洁
        casualtyCleaning();
        return house;

    }

    private void lookHouse() {
        System.out.println("看房子");
    }

    private void negotiate(double money) {
        double finalDeal = money;
        System.out.println("讨价还价，最终价格：" + finalDeal);
    }

    private void earnMoney(double money) {
        double earnedMoney = money * 0.2;
        System.out.println("赚差价，最终价格："+ earnedMoney);
    }

    private void signContract() {
        System.out.println("签合同");
    }

    private void casualtyCleaning() {
        System.out.println("定期保洁");
    }
}
