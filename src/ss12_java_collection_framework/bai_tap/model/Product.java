package ss12_java_collection_framework.bai_tap.model;

public class Product {
    private int id;
    private String name;
    private double money;

    public Product() {
    }

    public Product(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", name = '" + name + '\'' +
                ", money = " + money;
    }
}
