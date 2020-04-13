package entity;

public class EnergyCar implements Car {
    private double price;
    private String name;
    Speed speed;
    public EnergyCar() {
        System.out.println("energyCar。。。");
    }

    public EnergyCar(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public EnergyCar(double price, String name, Speed speed) {
        this.price = price;
        this.name = name;
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
