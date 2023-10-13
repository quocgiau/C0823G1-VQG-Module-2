package Access_modifier.bai_tap.bai2;

public class StudentRun {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("giau");
        student1.setClassName("C0823G1");
        Student student2 = new Student("cuong", "C0923G1");
        System.out.println(student1);
        System.out.println(student2);
    }
}
