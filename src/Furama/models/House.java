package Furama.models;

public class House extends Facility {
    private String standard;
    private int floor;

    public House() {
    }

    public House(int id, String code, String name, int area, int price, int people, String type, String standard, int floor) {
        super(id, code, name, area, price, people, type);
        this.standard = standard;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tiêu chuẩn = '" + standard + '\'' +
                ", Tầng = " + floor;
    }
}
