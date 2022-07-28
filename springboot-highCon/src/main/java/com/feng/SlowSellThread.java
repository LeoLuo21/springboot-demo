package com.feng;

public class SlowSellThread extends Thread{
    private SellTicket sellTicket;

    public SlowSellThread() {
    }

    public SlowSellThread(SellTicket sellTicket) {
        this.sellTicket = sellTicket;
    }

    public SellTicket getSellTicket() {
        return sellTicket;
    }

    public void setSellTicket(SellTicket sellTicket) {
        this.sellTicket = sellTicket;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        while (SellTicket.getAmount() > 0) {

            Ticket ticket = sellTicket.sellTicket();
        }
    }
}
