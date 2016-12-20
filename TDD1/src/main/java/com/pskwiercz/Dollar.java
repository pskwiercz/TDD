package com.pskwiercz;

/**
 * Created by pskwierc on 20/12/2016.
 */
public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount *= multiplier;
    }

    public int getAmount() {
        return amount;
    }
}
