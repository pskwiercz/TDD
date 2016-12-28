package com.pskwiercz;

/**
 * Created by pskwierc on 23/12/2016.
 */
public class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Expression add) {
        return new Sum(this, add);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount/rate, to);
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
