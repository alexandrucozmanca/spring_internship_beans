package ro.cozmanca.bean.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorCompany {
    private String name = "Constructor Company";
    private final ConstructorCar car;

    @Autowired
    public ConstructorCompany(ConstructorCar car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConstructorCar getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "ConstructorCompany{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
