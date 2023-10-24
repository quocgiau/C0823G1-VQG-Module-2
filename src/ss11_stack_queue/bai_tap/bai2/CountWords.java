package ss11_stack_queue.bai_tap.bai2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Chương trình đếm các lần xuất hiện của từ trong một văn bản và " +
                "hiển thị các từ và sự xuất hiện của chúng theo thứ tự trong bảng chữ cái của các từ";
        text = text.toLowerCase();
        String[] arr = text.split("[\\s\\p{Punct}]+"); // Tách các từ trong văn bản bằng khoảng trắng và dấu câu.
//        System.out.println(Arrays.toString(arr));
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        int count;
        for (String word : arr) {
            if (stringTreeMap.containsKey(word)) {
                count = stringTreeMap.get(word);
                stringTreeMap.put(word, count + 1);
            } else {
                stringTreeMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : stringTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
