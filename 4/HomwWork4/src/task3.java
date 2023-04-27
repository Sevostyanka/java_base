import java.util.Iterator;
import java.util.LinkedList;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(122);
        list.add(45);
        list.add(88);
        list.add(111);
        System.out.println("Сумма всех элементов равна: " + allSum(list));
    }
    static int allSum(LinkedList list) {
        int sum = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += (int)(iterator.next());
        }
        return sum;
    }
}
