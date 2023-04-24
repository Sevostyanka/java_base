import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class task2 {
    public static void main(String[] args) {
        //Задан целочисленный список ArrayList. Найти минимальное,
        // максимальное и среднее арифметическое из этого списка. Collections.max()

        ArrayList<Integer> myList = new ArrayList<>();
        int sizeArray = 8;
        int minArr = 0;
        int maxArr = 20;

        System.out.println("Вот массив:");
        randomFullArray(myList, sizeArray, minArr, maxArr);
        System.out.println(myList);


        int max = Collections.max(myList);
        int min = Collections.min(myList);

        System.out.println("Максимальное:" + max);
        System.out.println("Минимальное:" + min);

        averageArithmetic(myList);


    }
    static ArrayList<Integer> randomFullArray(ArrayList list, int size, int min, int max) {
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max-min+1) + min));
        }
        return list;
    }

    static void averageArithmetic(ArrayList list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + (int)(list.get(i));
        }
        System.out.println("Среднее арифметическое: " + sum / list.size());
    }

}
