//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class task2 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(22);
        queue.enqueue(111);
        queue.enqueue(33);
        queue.enqueue(88);
        queue.enqueue(555);
        queue.enqueue(77);

        queue.printQueue();

        queue.dequeue();
        queue.first();
        queue.dequeue();
        queue.first();

        queue.printQueue();


    }

}
