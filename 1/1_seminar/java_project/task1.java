/*Улитка ползёт по вертикальному шесту высотой h метров, 
поднимаясь за день на a метров, а за ночь спускаясь на b метров. 
На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b.
Гарантируется, что a>b. Программа должна вывести одно натуральное число */
package java_project;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите высоту шеста: ");
        int h = sc.nextInt();
        
        System.out.printf("Поднялась за день: ");
        int a = sc.nextInt();
       
        System.out.printf("Спустилась за ночь: ");
        int b = sc.nextInt();
        int meters = 0;
        int days = 1;
        do {
            meters = meters + a - b;
            days ++;
        }
        while (meters + a < h);
        System.out.println(days);
    }
}
