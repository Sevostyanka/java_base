import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1(){
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    static void sort(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder()); //comparator.reverseOrder() делает обратный порядок
    }
    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return result;
    }

}
