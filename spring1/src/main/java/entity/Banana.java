package entity;

public class Banana implements Fruit {
    private String name;

    public Banana(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Banana() {
    }
}
