import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//1) Написать метод, который принимает массив элементов, помещет их в стек и выводит на консоль содержимое стека.
//2) Написать метод, который принимает массив элемнетов, помещает их в очередь и выводит их из очереди.
public class Task4 {
    public static void main(String[] args) {
        ex4();
    }
    static void ex4() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        for (Integer item: queue) {
            System.out.println(item);
        }
    }
}
