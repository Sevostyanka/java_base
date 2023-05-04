/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.*/
public class Task1 {
    public static void main(String[] args) {
        ex0();
    }
    static void ex0(){
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321654", "Васильев");
        passports.add("564588", "Петрова");
        passports.add("567987", "Иванов");
        passports.add("845214", "Петрова");
        passports.add("556887", "Иванов");

        System.out.println(passports.get("564588"));
        System.out.println();
        System.out.println(passports.getByLastName("Иванов"));
        System.out.println();
        System.out.println(passports.getAll());
        System.out.println(passports.print());
    }
}