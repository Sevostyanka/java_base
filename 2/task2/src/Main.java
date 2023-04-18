import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        String text = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        String [] words = text.split(" ");
        String masha = "а";
        String oleg = "в";
        int countMasha = 0;
        int countOleg = 0;
        ArrayList<String> listM = new ArrayList<>();
        ArrayList<String> listO = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(masha) == true) {
                listM.add(words[i]);
                countMasha += 1;
            }
            if (words[i].contains(oleg) == true) {
                listO.add(words[i]);
                countOleg += 1;
            }

        }
        System.out.printf("%d - Masha words.", countMasha);
        System.out.println(listM);
        System.out.printf("%d - Oleg words.", countOleg);
        System.out.println(listO);
    }
}