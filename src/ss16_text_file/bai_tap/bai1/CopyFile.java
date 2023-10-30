package ss16_text_file.bai_tap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> readFile(String filePath) {
        List<String> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public static void writeFile(String filePath, List<String> strings, boolean flag) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, flag));
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> strings = readFile("src/ss16_text_file/bai_tap/bai1/source");
        writeFile("src/ss16_text_file/bai_tap/bai1/target", strings, true);
        int count = 0;
        for (String str : strings) {
            count += str.length();
        }
        System.out.println("Số ký tự trong line là: " + count);
    }
}
