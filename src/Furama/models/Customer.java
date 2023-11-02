package Furama.models;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(int id, String code, String name, String birthday, String gender, int idCard, int phone, String email, String type, String address) {
        super(id, code, name, birthday, gender, idCard, phone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Loại khách = '" + type + '\'' +
                ", Địa chỉ = '" + address;
    }
}
