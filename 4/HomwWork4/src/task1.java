import java.util.LinkedList;
import java.util.ListIterator;

//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(122);
        list.add(45);
        list.add(88);
        list.add(111);
        System.out.println(reverseList(list));

    }
    static LinkedList<Integer> reverseList(LinkedList list) {
        LinkedList<Integer> listnew = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            listnew.add(iterator.previous());
        }
        return listnew;
    }
}