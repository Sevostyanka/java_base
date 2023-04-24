import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        //Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        // Вывести название каждой планеты и количество его повторений в списке.

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Марс");
        planets.add("Плутон");
        planets.add("Уран");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Уран");
        planets.add("Марс");
        planets.add("Меркурий");
        planets.add("Меркурий");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Плутон");
        System.out.println(planets);
        System.out.println(checkItems(planets));
        ;

    }
    static ArrayList<String> checkItems(ArrayList list) {
        ArrayList quantity = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            if (quantity.contains(list.get(i))){
                continue;}
            else {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        sum++;
                    }
                }
                quantity.add(list.get(i));
                quantity.add(sum + ";");
            }
        }
        return quantity;
    }
}

