package ro.cozmanca.bean.multiple;

public class MultipleCar {
    private final String name;

    public MultipleCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MultipleCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
