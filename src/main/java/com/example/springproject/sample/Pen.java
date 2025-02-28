package com.example.springproject.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer {
    public Pen() {
        System.out.println("pen constructor");
    }

    @Override
    public void exam() {
        System.out.println("GitHub");
        System.out.println("exam written by pen");
    }
}
