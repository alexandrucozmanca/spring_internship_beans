package ro.cozmanca.bean.multiple;

public class MultipleCompany {
    private String name;
    private MultipleCar car;

    public MultipleCompany(String name, MultipleCar car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipleCar getCar() {
        return car;
    }

    public void setCar(MultipleCar car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "MultipleCompany{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
