import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// Пример: s = “cba”, index = [3,2,1] result “abc”
public class task1 {
    public static void main(String[] args) {
        String firstStr = "edcba";
        String[] strArray = firstStr.split(""); //сплитую строку в массив
        int size = firstStr.length(); // просто для удобства отпределяю размер
        int [] arrInd = new int[size]; //пустой массив для индексов в обратном порядке

        for (int i = 0; i < size; i ++) {
            arrInd[i] = i; //заполняю индексы обычным порядком
        }

        for (int i =0; i < size/2; i++) { //меняю местами порядок индексов
            int temp = arrInd[i];
            arrInd[i] = arrInd[arrInd.length - i - 1];
            arrInd[arrInd.length - i - 1] = temp;
        }
        System.out.print(Arrays.toString(arrInd));

        String newArr[] = new String[size]; //массив для правильног порядка букв

        for (int i =0; i < size; i++) { //заполняю буквами в правильном порядке
             newArr[arrInd[i]] = strArray[i];

        }
        System.out.print(Arrays.toString(newArr));
    }

    }

