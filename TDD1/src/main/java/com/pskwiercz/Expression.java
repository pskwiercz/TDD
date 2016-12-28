package com.pskwiercz;

/**
 * Created by pskwierc on 28/12/2016.
 */
public interface Expression {

    Expression plus(Expression add);

    Expression times(int multipler);

    Money reduce(Bank bank, String to);
}


