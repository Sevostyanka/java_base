import java.util.Arrays;
import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salay = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_1";
        w2.lastName = "Фамилия_1";
        w2.salay = 100;
        w2.id = 1000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salay = 300;
        w3.id = 3000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_4";
        w4.lastName = "Фамилия_4";
        w4.salay = 200;
        w4.id = 2000;

        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));
        var workers = new HashSet<Worker>(Arrays.asList(w1,w4,w3));
        System.out.println(workers.contains(w2));

        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
        System.out.println(w4.toString());

    }
}
