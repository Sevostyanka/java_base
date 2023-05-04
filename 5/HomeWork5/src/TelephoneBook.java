import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что 1 человек может иметь несколько телефонов. Нужны методы добавления новой записи
в книгу и метод поиска записей в телефонной книге*/
public class TelephoneBook {
    private Map<String, List<String>> book= new HashMap<>();

    void add(String name, String number) {
        if (book.containsKey(name)) {
            List<String> phones = book.get(name);
            phones.add(number);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(number);
            book.put(name, phones);

        }

    }

    void findContact(String info) {
        if (book.containsKey(info)) { //ищет инфу по имени (по ключу)
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : book.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(info)) {
                    stringBuilder.append(entry.getKey());
                    stringBuilder.append(": ");
                    stringBuilder.append(entry.getValue().toString());
                    stringBuilder.append("\n");
                }
            }
            System.out.println(stringBuilder.toString());

        } else { //ищет инфу по номеру телефона
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : book.entrySet()) {
                if (entry.getValue().contains(info)) {
                    stringBuilder.append(entry.getKey());
                    stringBuilder.append(": ");
                    stringBuilder.append(entry.getValue().toString());
                    stringBuilder.append("\n");
                }
                }
            System.out.println(stringBuilder.toString());
            }
        }
}
