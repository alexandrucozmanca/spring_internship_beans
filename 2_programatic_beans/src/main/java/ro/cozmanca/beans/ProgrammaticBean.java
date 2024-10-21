package ro.cozmanca.beans;

import org.springframework.stereotype.Component;

@Component
public class ProgrammaticBean {
    String name;
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgrammaticBean(String name) {
        this.name = name;
    }

    public ProgrammaticBean() {
    }
}

