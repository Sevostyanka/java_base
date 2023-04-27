import java.util.Iterator;
import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class MyQueue {
    private LinkedList<Integer> list = new LinkedList<>();

    void enqueue(int num) { //помещает элемент в конце списка
        list.addLast(num);
    }

    void dequeue(){ //возвращает первый элемент из очереди и удаляет его
        System.out.println("Удалён первый элемент очереди: " + list.pollFirst());
    }

    void first() { //возвращает первый элемент из очереди, не удаляя
        System.out.println("Первый элемент: " + list.getFirst());
    }

    void printQueue () {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
