package com.test.learn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public void work(String text) {
        System.out.println(text);
    }
}
