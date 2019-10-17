package com.example.demo.command;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

@ShellComponent
public class Dynamic {

    private boolean enable = true;

    @ShellMethod(key = "dynamic", value="dynamic availability test")
    public void dynamic(){
        this.enable = false;
        System.out.println("Run Dynamic!");
    }

    @ShellMethodAvailability("dynamic")
    public Availability myAvailability() {
        return enable
                ? Availability.available()
                : Availability.unavailable("You Already run this command !");
    }
}
