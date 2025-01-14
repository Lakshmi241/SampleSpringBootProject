package com.example.springproject.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {
    //int age;
    //@Autowired
    private Pen pen;

   /*@Autowired
        public void setPen(Pen pen) {
        System.out.println("Setter Method");
            this.pen = pen;
        }*/
    @Autowired
    public Student(Pen pen) {
        this.pen = pen;
    }

    public Student() {
        System.out.println("student constructor");
    }

    public void writeExam() {
        pen.exam();

    }

    public void display() {
        System.out.println("student method");
    }
}
