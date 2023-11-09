package Furama.models;

public class Villa extends Facility{
    private String standard;
    private int areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(int id, String code, String name, int area, int price, int people, String type, String standard, int areaPool, int floor) {
        super(id, code, name, area, price, people, type);
        this.standard = standard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
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
                ", Diện tích hồ bơi = '" + areaPool + '\'' +
                ", Tầng = " + floor;
    }
}
