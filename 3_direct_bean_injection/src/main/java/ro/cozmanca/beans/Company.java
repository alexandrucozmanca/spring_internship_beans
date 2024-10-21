package ro.cozmanca.beans;

public class Company {
     String name;
     Car car;

    public Company(String name, Car animal) {
        this.name = name;
        this.car = animal;
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
