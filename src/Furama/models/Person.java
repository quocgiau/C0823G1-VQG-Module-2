package Furama.models;

public class Person {
    private int id;
    private String code;
    private String name;
    private String birthday;
    private String gender;
    private int idCard;
    private int phone;
    private String email;

    public Person() {
    }

    public Person(int id, String code, String name, String birthday, String gender, int idCard, int phone, String email) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Mã = '" + code + '\'' +
                ", Tên = '" + name + '\'' +
                ", Ngày sinh = '" + birthday + '\'' +
                ", Giới tính = '" + gender + '\'' +
                ", CMND = " + idCard +
                ", SĐT = " + phone +
                ", email = '" + email + '\'';
    }
}
