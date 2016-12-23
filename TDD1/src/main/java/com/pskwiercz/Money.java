package com.pskwiercz;

/**
 * Created by pskwierc on 23/12/2016.
 */
public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return (this.getAmount() == money.getAmount()) &&
                (currency().equals(money.currency()));
    }

    public int getAmount() {
        return amount;
    }

    String currency() {
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }
}
