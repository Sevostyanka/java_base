import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//Консольное приложение, которое принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task3 {
    public static void main(String[] args) {
    ex3();
    }
    static void ex3() {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList();
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();

            switch (line) {
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("До новых встреч!");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);

            }
        }
    }
}
