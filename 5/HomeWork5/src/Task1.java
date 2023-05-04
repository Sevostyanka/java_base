/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что 1 человек может иметь несколько телефонов. Нужны методы добавления новой записи
в книгу и метод поиска записей в телефонной книге*/
public class Task1 {
    public static void main(String[] args) {
        TelephoneBook book = new TelephoneBook();
        book.add("Kate", "+79845567820");
        book.add("Max", "+78854567899");
        book.add("Mikle", "85648954");
        book.add("Kate", "8854562");

        book.findContact("8854562");
        book.findContact("Max");
    }

}