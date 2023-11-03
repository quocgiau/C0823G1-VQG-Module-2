package Furama.models;

public class Booking {
    public String id;
    public String bookingDate;
    public String startDay;
    public String endDate;
    public String idCustomer;
    public String idService;

    public Booking() {
    }

    public Booking(String id, String bookingDate, String startDay, String endDate, String idCustomer, String idService) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.startDay = startDay;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", Ngày thuê = '" + bookingDate + '\'' +
                ", Ngày đến = '" + startDay + '\'' +
                ", Ngày đi = '" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService;
    }
}
