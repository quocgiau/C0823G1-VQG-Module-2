package Access_modifier.bai_tap.bai2;

public class Student {
    private String name = "John";
    private String className = "C02";

    public Student() {
    }

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + name +
                ", className = " + className +
                '}';
    }
}
