package ro.cozmanca.bean.setter;

import org.springframework.stereotype.Component;

@Component
public class SetterCar {
    private String name = "SetterCar";

    public SetterCar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SetterCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
