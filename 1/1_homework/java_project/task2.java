/*Вывести все простые числа от 1 до 1000 */

// Честно говорю, что проверку числа на "простоту" нашла в интернете.
package java_project;

public class task2 {

    public static boolean simpleNum(int n) {
        if (n<=1) return false;
        if (n==2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i =5; i*i <= n; i +=6) {
            if (n%i==0 || n%(i+2)==0) {return false;}
        }
        return true;
    }
    public static void main(String[] args) {
        
        for (int i = 1; i <=1000; i++) {
            if (simpleNum(i) == true) {
                System.out.printf("%d, ", i);
            }
        }

    }
}
