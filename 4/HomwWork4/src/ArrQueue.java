import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
public class ArrQueue {
    private Integer[]arr = new Integer[10];
    private int size = 0;

    void enqueue(int num) {
        if (size == arr.length) {
            Integer[] arr2 = new Integer[arr.length + 15];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size] = num;
        size++;
    }

    void dequeue() {
        System.out.println("Удалён первый элемент: " + arr[0]);
        for (int i =0; i <= size; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    void first() {
        System.out.println("Первый элемент: " + arr[0]);
    }
}
