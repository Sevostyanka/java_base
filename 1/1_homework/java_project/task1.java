/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */
package java_project;
import java.util.Scanner;
public class task1 {

    static int triangularNumber(int n) {
        if (n == 1) return 1;
        if (n <=0 ) return -1;
        return n+(triangularNumber(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите N: ");
        int n = sc.nextInt();

        int result = triangularNumber(n);
        if (result == -1) {
            System.out.println("Были введены неверные данные (n <= 0).");
        } else {
            System.out.printf("Ответ: %d.", result);
        }

    }
}
