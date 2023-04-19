// Работа с файлами
import java.io.*;
import java.nio.charset.StandardCharsets;
public class task3 {
    public static void main(String[] args) throws IOException {

// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
        File file = new File("my_day.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}