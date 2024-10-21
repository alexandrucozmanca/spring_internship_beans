package ro.cozmanca.bean.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterCompany {
    private String name = "Setter Company";
    private SetterCar car;

    public SetterCompany() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SetterCar getCar() {
        return car;
    }

    @Autowired
    public void setCar(SetterCar car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "SetterCompany{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
