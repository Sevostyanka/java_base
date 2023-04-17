/*Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
если разрешается сделать один разлом по прямой между дольками 
(то есть разломить шоколадку на два прямоугольник */
package java_project;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ширина шоколадки: ");
        int a = sc.nextInt();

        System.out.printf("Длина шоколадки: ");
        int b = sc.nextInt();

        System.out.printf("Сколько кусочков хотите отломить? ");
        int bite = sc.nextInt();

        if ((bite%a==0 || bite%b==0) && (bite <= (a*b-a) || bite <= (a*b-b))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
