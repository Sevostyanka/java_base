import java.util.LinkedList;
import java.util.Scanner;

//Реализовать консольное приложение, которое принимает от пользователя строку вида
//text~num
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
public class Task2 {
    public static void main(String[] args) {
    ex2();
    }
    static void ex2() {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList();
        while (work) {
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();
            String[] splitLine = command.split("~");
            switch (splitLine[0]) {
                case "print":
                    System.out.println(list.remove(Integer.parseInt(splitLine[1])));
                    break;
                case "exit":
                    System.out.println("До новых встреч!");
                    work = false;
                    break;
                default:
                    list.add(Integer.parseInt(splitLine[1]), splitLine[0]);
            }
        }
    }
}
