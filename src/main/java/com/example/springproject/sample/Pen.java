package com.example.springproject.sample;

import org.springframework.stereotype.Component;

@Component
public class Pen {
    public Pen() {
        System.out.println("pen constructor");
    }

    public void exam() {
        System.out.println("exam written by pen");
    }
}
