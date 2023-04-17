/*Вводится массив (сначала количество элементов, потом сами элементы). 
Найдите сумму его элементов с чётными индексами и выведите её. 
А потом выведите числа, которые суммировались. */
package java_project;
import java.util.Scanner;
public class task4 {
    static void printMassiv(int[] arr) {
        for (int item: arr) {
            System.out.printf("%d, ", item);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кол-во элементов: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%d-й элемент: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Массив:");
        printMassiv(arr);

        int sum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sum += arr[i];
        }
        System.out.printf("Сумма: %d\n", sum);

        System.out.println("Суммировались числа:");
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
            System.out.println(arr[i]);
        }
            
    }
}
}
