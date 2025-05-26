package com.test.learn;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void work(String text) {
        System.out.println(text);
    }
}
