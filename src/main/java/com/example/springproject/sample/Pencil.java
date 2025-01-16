package com.example.springproject.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer {
    @Override
    public void exam() {
        System.out.println("exam written by pencil");
    }
}
