package Furama.models;

public class Room extends Facility{
    private String free;

    public Room() {
    }

    public Room(int id, String code, String name, String area, int price, int people, String type, String free) {
        super(id, code, name, area, price, people, type);
        this.free = free;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Dịch vụ miễn phí = '" + free;
    }
}
