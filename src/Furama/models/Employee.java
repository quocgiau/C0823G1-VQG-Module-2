package Furama.models;

public class Employee extends Person {
    private String level;
    private String location;
    private int wage;

    public Employee() {
    }

    public Employee(int id, String code, String name, String birthday, String gender, int idCard, int phone, String email, String level, String location, int wage) {
        super(id, code, name, birthday, gender, idCard, phone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Trình độ = '" + level + '\'' +
                ", Vị trí = '" + location + '\'' +
                ", Lương = " + wage;
    }
}
