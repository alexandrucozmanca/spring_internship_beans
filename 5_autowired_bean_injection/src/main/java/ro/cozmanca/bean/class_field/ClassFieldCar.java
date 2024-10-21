package ro.cozmanca.bean.class_field;

import org.springframework.stereotype.Component;

@Component
public class ClassFieldCar {
    private String name = "Class Field Car";

    public ClassFieldCar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassFieldCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
