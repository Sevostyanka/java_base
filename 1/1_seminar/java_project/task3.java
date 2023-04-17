package java_project;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("X: ");
        double x = sc.nextDouble();
        System.out.println("Y: ");
        int y = sc.nextInt();

        int counter = 0;
        while (x < y) {
            x *= 1.1;
            counter ++;
        }
        System.out.println(counter);
    }
}
