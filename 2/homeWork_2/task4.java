// Работа с файлами
import java.io.*;
import java.nio.charset.StandardCharsets;
public class task4 {
    public static void main(String[] args) throws IOException {
//  читаем файл
        File file = new File("my_day.txt");
        String name = "Катрин";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String newLine;
            while ((line = br.readLine()) != null) {
                if (line.contains("%s")) {
                    newLine = line.replace("5s", name);
                    try (FileWriter fw = new FileWriter(file);
                         BufferedWriter bf = new BufferedWriter(fw);
                         PrintWriter out = new PrintWriter(bf)) {
                        out.print(newLine);
                        System.out.println("Успешно добавлены данные в файл");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    }
                }


        } catch (IOException e) {
            e.printStackTrace();
        }
} }
