package com.example.springproject.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Sketch implements Writer {
    @Override
    public void exam() {
        System.out.println("exam written by sketch");
    }
}
