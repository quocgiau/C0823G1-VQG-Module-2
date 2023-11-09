package Furama.models;

public class Facility {
    private int id;
    private String code;
    private String name;
    private int area;
    private int price;
    private int people;
    private String type;

    public Facility() {
    }

    public Facility(int id, String code, String name, int area, int price, int people, String type) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.area = area;
        this.price = price;
        this.people = people;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mã = '" + code + '\'' +
                ", Tên = '" + name + '\'' +
                ", Diện tích sử dụng = '" + area + '\'' +
                ", Chi phí = " + price +
                ", Số người = " + people +
                ", Kiểu thuê = '" + type + '\'';
    }
}
