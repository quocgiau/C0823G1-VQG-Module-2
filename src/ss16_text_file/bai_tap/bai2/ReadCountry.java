package ss16_text_file.bai_tap.bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCountry {
    public static List<Country> readFile(String filePath) {
        List<Country> countries = new ArrayList<>();
        Country country;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                country = new Country(Integer.parseInt(strings[0]), strings[1], strings[2]);
                countries.add(country);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public static void main(String[] args) {
        List<Country> countries = readFile("src/ss16_text_file/bai_tap/bai2/countries.csv");
        for (Country str : countries){
            System.out.println(str);
        }
    }
}
