package com.example.demo.command;

import com.example.demo.util.MessageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.math.BigDecimal;

@ShellComponent
public class Calculator {

    @Autowired
    MessageHelper messageHelper;

    @ShellMethod(value = "add",key = "add")
    public void add(int a,int b){
        messageHelper.printSuccess(String.valueOf(a+b));
    }

    @ShellMethod(value = "minus",key = "minus")
    public void minus(int a,int b){
        messageHelper.printSuccess(String.valueOf(a-b));
    }

    @ShellMethod(value = "multi",key = "multi")
    public void multi(int a,int b){
        messageHelper.printSuccess(String.valueOf(a*b));
    }

    @ShellMethod(value = "divide",key = "divide")
    public void divide(double a,double b){
        messageHelper.printSuccess(String.valueOf(new BigDecimal(a).divide(new BigDecimal(b))));
    }
}
