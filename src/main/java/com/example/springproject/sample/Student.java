package com.example.springproject.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {
    //int age;
    @Autowired
    @Qualifier("pencil")
    private Writer writer;

    /*@Autowired
         public void setPen(Pen pen) {
         System.out.println("Setter Method");
             this.pen = pen;
         }*/

    public Student(Writer writer) {
        this.writer = writer;
    }

    public Student() {
        System.out.println("student constructor");
    }

    public void writeExam() {
        writer.exam();

    }

    public void display() {
        System.out.println("student method");
        System.out.println("Student new ");
    }
}
