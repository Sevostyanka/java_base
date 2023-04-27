//реализовать вторую задачу через собственный класс используя в основе массив
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
public class task4 {
    public static void main(String[] args) {
        ArrQueue queue = new ArrQueue();
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(30);
        queue.enqueue(7);

        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        queue.first();
        queue.printQueue();
    }
}

