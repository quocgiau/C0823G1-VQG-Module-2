package Furama.models;

public class Contract {
    private int id;
    private String idBooking;
    private int deposit;
    private int price;

    public Contract() {
    }

    public Contract(int id, String idBooking, int deposit, int price) {
        this.id = id;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id = " + id +
                ", Mã Booking = '" + idBooking + '\'' +
                ", Tiền cọc = " + deposit +
                ", Thanh toán = " + price;
    }
}
