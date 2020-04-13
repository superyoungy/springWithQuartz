package entity;

public class Apple implements Fruit {
    String name;

    public Apple(String name) {
        this.name = name;
    }

    public Apple() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
