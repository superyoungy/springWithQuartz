package entity;

public class OilCar implements Car {
    private double price;
    private String name;
    Speed speed;

    public OilCar() {
        System.out.println("oilcar。。。");
    }

    public OilCar(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public OilCar(double price, String name, Speed speed) {
        this.price = price;
        this.name = name;
        this.speed = speed;
    }

    public void initMethod() {
        System.out.println("init...");
    }

    public void destroyMethod() {
        System.out.println("destroy...");
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
