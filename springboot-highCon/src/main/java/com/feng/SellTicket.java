package com.feng;


import java.util.concurrent.ConcurrentLinkedDeque;

public class SellTicket {
    private static ConcurrentLinkedDeque<Ticket> tickets = new ConcurrentLinkedDeque<>();

    private static int amount;

    private static int sellAmount;

    public static int getSellAmount() {
        return sellAmount;
    }

    public static int getAmount() {
        return amount;
    }


    public static void initTicket(int n) {
        amount = n;
        for (int i = 0; i < n; i++) {
            tickets.add(new Ticket(i + 1));
        }
    }

    public Ticket sellTicket() {
        synchronized (SellTicket.class) {
            if (!tickets.isEmpty()) {
//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                Ticket t = tickets.removeFirst();
                amount--;
                sellAmount++;
                String name = Thread.currentThread().getName();
                System.out.println("ticket-" + t.getId() + "已经在" + name + "售出");
                return t;
            }
        }
        return null;
    }
}
