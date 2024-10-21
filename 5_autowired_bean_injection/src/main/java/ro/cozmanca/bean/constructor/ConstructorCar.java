package ro.cozmanca.bean.constructor;

import org.springframework.stereotype.Component;

@Component
public class ConstructorCar {
    private String name = "Constructor Car";

    public ConstructorCar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConstructorCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
