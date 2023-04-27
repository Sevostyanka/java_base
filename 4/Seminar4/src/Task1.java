import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Task1 {
    public static void main(String[] args) {
    ex1();
    }
    static void ex1() {
        long timeStart = System.currentTimeMillis();
         List<Integer> list1 = new ArrayList<>();
         for (int i = 0; i < 100000; i++) {
            list1.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println("ArraList: " + (timeFinish - timeStart));

        long timeStart2 = System.currentTimeMillis();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }
        long timeFinish2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (timeFinish2 - timeStart2));

    }
}