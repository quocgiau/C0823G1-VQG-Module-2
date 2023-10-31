package ss16_text_file.bai_tap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> readFile(String filePath) {
        BufferedReader bufferedReader = null;
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(filePath);
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
            e.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lines;
    }

    public static void writeFile(String filePath, List<String> strings, boolean flag) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, flag));
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
