package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ComponentBean {

    String name;

    @PostConstruct
    public void init() {
        this.name = "ComponentBean with postConstruct";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentBean(String name) {
        this.name = name;
    }

    public ComponentBean() {
    }
}
