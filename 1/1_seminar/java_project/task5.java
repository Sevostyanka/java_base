/*Напишите программу, которая выводит в столбик целые числа от а до b (a >= b). 
 * С шагом с. Границы включаются.
 * Вводные данные:
 * Заданы 3 целых сила а, b, c, где а > b.
 * Выходные данные:
 * выводить поштучно в столбик числа от а до б. 
 */

package java_project;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("От: ");
        int a = sc.nextInt();

        System.out.println("До: ");
        int b = sc.nextInt();

        System.out.println("Шаг: ");
        int c = sc.nextInt();

        // while (a >= b) {
        //     System.out.println(a);
        //     a = a - c;
        // }
        for (int i = a; i >= b; i-=c) {
            System.out.println(i);
        }
    }
}
