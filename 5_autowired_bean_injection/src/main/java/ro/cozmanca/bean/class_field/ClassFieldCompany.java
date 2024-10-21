package ro.cozmanca.bean.class_field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassFieldCompany {
    private String name = "Class Field Company";

    @Autowired
    private ClassFieldCar car;

    public ClassFieldCompany() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassFieldCar getCar() {
        return car;
    }

    public void setCar(ClassFieldCar car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "ClassFieldCompany{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
