package com.feng;

public class BuyTicket {
    public static void main(String[] args) throws InterruptedException {

        SellTicket.initTicket(1000);

        for (int i = 0;i<20;i++) {
            SellThread s1 = new SellThread(new SellTicket());
            s1.setName("售票点"+(i+1));
            s1.start();
        }

        Thread.sleep(20000);
        System.out.println(SellTicket.getSellAmount());
    }
}
