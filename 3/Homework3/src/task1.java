import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
//        Пусть дан произвольный список целых чисел, удалить из него четные числа
//        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int sizeArray = 8;
        int min = 0;
        int max = 20;
        System.out.println("Сначала оригинал:");
        randomFullArray(list, sizeArray, min, max);
        System.out.println(list);

        System.out.println("А теперь только чётные:");
        deliteOdd(list);
        System.out.println(list);


    }
    static ArrayList<Integer> deliteOdd(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            if ((int)(list.get(i))%2!=0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    static ArrayList<Integer> randomFullArray(ArrayList list, int size, int min, int max) {
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max-min+1) + min));
        }
        return list;
    }

}