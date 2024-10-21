package ro.cozmanca.bean.constructorAndMultiple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ro.cozmanca.bean.multiple.MultipleCar;

@Component
public class ConstructorAndMultipleCompany {
    private final String name = "Constructor and Multiple Company with Third Multiple Car";
    private final MultipleCar car;

    public ConstructorAndMultipleCompany(@Qualifier("third_multiple_car") MultipleCar car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "ConstructorAndMultipleCompany{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
