package com.example.demo.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import javax.validation.constraints.Size;

@ShellComponent
public class Hello {

    @ShellMethod(value = "Say hello",key = "test" ,group = "Greeting")
    public void hello(@Size(min=3) String name){
        System.out.println("hello " + name + "!");
    }

}
