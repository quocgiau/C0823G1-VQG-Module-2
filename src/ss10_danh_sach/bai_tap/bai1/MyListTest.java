package ss10_danh_sach.bai_tap.bai1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> arrayList = new MyList<>();
        arrayList.add(0,"Một");
        arrayList.add(1,"Hai");
        arrayList.add(2,"Ba");
        arrayList.add(3,"Bốn");
        arrayList.add(4,"Năm");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Sau khi xóa vị trí thứ 2 ");
        arrayList.remove(2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Năm có trong mảng hay không? :  " + arrayList.contains("Năm"));
        System.out.println("Hai đang ở vị trí số : " + arrayList.indexOf("Hai"));
    }
}
