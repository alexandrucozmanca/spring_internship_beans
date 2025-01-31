package ro.cozmanca.bean;

public class Company {
    private String name;
    private Car car;

    public Company(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
