package com.example.demo.command;

import com.example.demo.model.User;
import com.example.demo.util.MessageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Arrays;

@ShellComponent
public class Greet {

    @Autowired
    MessageHelper messageHelper;

    @ShellMethod(value = "greet string", key = "greet", group = "Greeting")
    public void greet(@ShellOption(value = "name")  final String name) {
        System.out.println("hi " + name + "!");
    }

    @ShellMethod(value = "greet to five people",key = "greet5" ,group = "Greeting")
    public void greetToFivePeople(@ShellOption(arity = 5) String[] list){
        Arrays.stream(list).forEach(System.out::println);
    }

    @ShellMethod(value = "greet , input string with comma separator..... ",key = "greet1" ,group = "Greeting")
    public void greetWithConverter(User user){
        System.out.println(user != null ? user.toString() : "user is null");
    }

    @ShellMethod(value = "greet string", key = "greet2", group = "Greeting")
    public void greetColorful(@ShellOption(value = "name")  final String name) {
        messageHelper.print("hi " + name + "!");
        messageHelper.printSuccess("hi " + name + "!");
        messageHelper.printError("hi " + name + "!");
        messageHelper.printWarning("hi " + name + "!");
        messageHelper.printInfo("hi " + name + "!");
    }
}
