package com.test.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private Computer comp;

    public void build() {
        comp.work("Learning about the different components of the Spring framework");
        System.out.println("Started learning Java");
    }
}
