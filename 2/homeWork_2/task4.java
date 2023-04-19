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
                    newLine = line.replace("%s", name);
                    System.out.println(newLine);
                    FileWriter fw = new FileWriter(file);
//                    BufferedWriter bf = new BufferedWriter(fw);
//                    PrintWriter out = new PrintWriter(bf);
//                    out.print(newLine);
                    fw.write(newLine);
                    fw.close();

                    }
                }


        } catch (IOException e) {
            e.printStackTrace();
        }
} }
