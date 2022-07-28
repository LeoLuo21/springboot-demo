package com.feng;

public class SellThread extends Thread {
    private SellTicket sellTicket;

    public SellThread() {
    }

    public SellThread(SellTicket sellTicket) {
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

        while (SellTicket.getAmount() > 0) {

            Ticket ticket = sellTicket.sellTicket();
        }
    }
}
