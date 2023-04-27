//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().
public class Task5 {
    public static void main(String[] args) {
        ex5();
    }
    static void ex5() {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(7);
        stack.push(3);
        stack.push(8);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
