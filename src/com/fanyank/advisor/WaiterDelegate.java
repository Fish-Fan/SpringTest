package com.fanyank.advisor;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class WaiterDelegate {
    private Waiter waiter;

    public void service(String clientName) {
        waiter.greetTo(clientName);
        waiter.serverTo(clientName);
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
