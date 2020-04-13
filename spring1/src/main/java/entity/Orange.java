package entity;

public class Orange implements Fruit{
    String name;

    public Orange(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Orange() {
    }
}
