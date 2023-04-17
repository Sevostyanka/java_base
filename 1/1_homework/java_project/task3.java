/*Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить */
package java_project;
import java.util.Scanner;
public class task3 {

    static int sum(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }

    static double devision(int a, int b) {
        return a / b;
    }

    static int subtraction (int a, int b) {
        return a - b;
    }

    static int degree(int a, int b) {
        int deg = 1;
        for (int i = 1; i<=b; i++) {
            deg = deg * a;
        }
        return deg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Доступные действия: +, -, *, /, **\n(Пример: '5 + 2' С ПРОБЕЛАМИ!)\nВведите, что хотите посчитать? :\n");
        String strPattern = sc.nextLine();

        String [] arr = strPattern.split(" ");
        int num1 = Integer.parseInt(arr[0]);
        String action = arr[1];
        int num2 = Integer.parseInt(arr[2]);
            

        // System.out.printf("%d, %s, %d ", num1, action, num2);

        switch (action) {
            case "+": System.out.println(sum(num1, num2)); break;
            case "-": System.out.println(subtraction(num1, num2)); break;
            case "*": System.out.println(multiply(num1, num2)); break;
            case "/": System.out.println(devision(num1, num2)); break;
            case "**": System.out.println(degree(num1, num2)); break;
            default: System.out.println("Введён неверный формат или неизвестное действие.");

        }
    }
}
