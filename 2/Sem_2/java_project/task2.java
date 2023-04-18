/*Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, 
в которой перечислены слова, которые написаны в газете.
Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
Sample Input:
а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:
7
5 */

package java_project;
import java.util.List;
import java.util.ArrayList;

public class task2 {
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
    
    
}
