package com.pskwiercz;

/**
 * Created by pskwierc on 28/12/2016.
 */
public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
