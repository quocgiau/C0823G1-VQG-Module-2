package ss10_danh_sach.bai_tap.bai2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1, "Giàu");
        myLinkedList.add(2, "Hiếu");
        myLinkedList.add(3,"Ngọc");
        myLinkedList.addFirst("Tuấn");
    }
}
