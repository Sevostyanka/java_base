/*Дана строка, в которой через пробел перечислены цифры. 
На следующей строке вводится цифра. 
Определите индексы первого и последнего ее вхождения. */
package java_project;
// import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        // s.indexOf()
        // s.lastIndexOf()
        String num = "5";
        System.out.println(str.indexOf(num));
        System.out.println(str.lastIndexOf(num));
        }
    }

 