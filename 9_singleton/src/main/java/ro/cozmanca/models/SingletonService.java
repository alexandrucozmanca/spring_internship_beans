package ro.cozmanca.models;

public class SingletonService {
    private String name;

    public SingletonService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
