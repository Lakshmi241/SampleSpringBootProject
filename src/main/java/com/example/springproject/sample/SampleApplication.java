package com.example.springproject.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SampleApplication.class, args);
        Student std = context.getBean(Student.class);
        //std.age = 20;
        // System.out.println(std.age);
        // Student std1 = context.getBean(Student.class);
        //std1.age = 30;
        //System.out.println(std1.age);
        // System.out.println(std.age);
        std.display();
        std.writeExam();
    }

}
