/*Вводится натуральное число n. Вичислите n!("эн-факториал") - 
произведение всех натуральных чисел от 1 до n.
пример:
ввод: 5
вывод: 120 */
package java_project;
import java.util.Scanner;
public class task4 {
    
    static int factorial (int n) {
        if (n<0) return 0;
        if (n==0) return 1;
        if (n==1) return 1;
        
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int n = sc.nextInt();
        if (factorial(n) == 0) {
        System.out.println("Нельзя отрицательные числа");}
        else {
            System.out.println(factorial(n));
        }
    }
    
}
