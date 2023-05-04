import java.util.*;

/*Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет
повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
Для сортировки использовать TreeMap.*/
public class Task2 {
    public static void main(String[] args) {
//        String members = "Иван Иванов, Светлана Петрова, Кристина Белова,\n" +
//                "Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,\n" +
//                "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,\n" +
//                "Иван Мечников, Петр Петин, Иван Ежов";

        String myNames = "Катя, Миша, Марина, Миша, Катя, Лёша, Миша, Катя, Миша, Лёша, Натя";

//        countNames(members);
        countNames(myNames);
    }

    static void countNames(String line) {
        line = line.replace("\n", " ");
        String[] all = line.split(", ");

        List<String> names = new ArrayList<>();
        for (String item : all) {
            String[] tempor = item.split(" ");
            names.add(tempor[0]);
        } // оставили только имена
        System.out.println("\n" + names + "\n");

        /* 1й способ: */System.out.println("\nПервый способ:");
        TreeMap<Integer, String> amountNames = new TreeMap<>(Comparator.reverseOrder());
        for (String item : names) {
            if (!amountNames.containsValue(item)) {
            int count = Collections.frequency(names, item);
                amountNames.put(count, item);
                System.out.printf("%d - %s; ", count, item);
            }
        }
        System.out.println("\n" + amountNames);

        /* 2й способ: */
        System.out.println("\nВторой способ:");
        TreeMap<Integer, String> countNames = new TreeMap<>(Comparator.reverseOrder());
        for (String item: names) {
            if (!countNames.containsValue(item)){
                int count = 0;
            for (String j: names) {
                    if (item.equalsIgnoreCase(j)) {
                        count++;
                    }
                }
            System.out.printf("%d - %s; ", count, item);
            countNames.put(count,item);
            }
        }

        System.out.println("\n" + countNames);


    }
}

