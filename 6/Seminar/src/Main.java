

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Васька", 10, "Василий Петрович", "Корниш-рекс");
        cat1.setName("Барсик");
//        System.out.println(cat1);
        Cat cat2 = new Cat("Мурка", 2, "Екатерина Витальевна", "Дворовая");
        Cat cat3 = new Cat("Мурка", 2, "Екатерина Витальевна", "Дворовая");
//        System.out.println(cat2);
//        System.out.println(cat3);
//        System.out.println(cat2.equals(cat3));

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

    }

}
