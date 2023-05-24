import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Acer Aspire 3 A315-56-513B", 66999, 4, "чёрный",15.6,
                8, 8);
        Laptop lap2 = new Laptop("ASUS TUF Dash F15 FX517ZE-HN046", 167999, 8,"чёрный",
                15.6, 16, 10);
        Laptop lap3 = new Laptop("Apple MacBook Pro", 165599, 8,"серый, ", 14.2,
                16, 17);
        Laptop lap4 = new Laptop("ASUS VivoBook 15X OLED M1503QA-L1223", 58999, 8, "синий",
                15.6, 16, 10);
        Laptop lap5 = new Laptop("ASUS TUF Gaming F15 FX506HM-HN016", 96999, 6, "чёрный",
                15.6, 16, 5);
        Laptop lap6 = new Laptop("Apple MacBook Pro", 323999, 12,"чёрный", 14.2,
                32, 18);
        Laptop lap7 = new Laptop("ASUS Laptop 15 D543MA-DM1368", 19999, 2,"чёрный",
                15.6, 4, 6);
        Laptop lap8 = new Laptop("ASUS Laptop 14 F415EA-EB1272", 32999, 2,"серый", 14,
                8, 8);
        Laptop lap9 = new Laptop("Acer Predator Helios 300", 199990, 8, "серый", 17.3,
                16, 6);

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(lap1);
        laptops.add(lap2);
        laptops.add(lap3);
        laptops.add(lap4);
        laptops.add(lap5);
        laptops.add(lap6);
        laptops.add(lap7);
        laptops.add(lap8);
        laptops.add(lap9);

        filter(laptops);

    }
        public static void filter(Set<Laptop> laptops) {
            Set<Laptop> results = new HashSet<>(); //для записи подходящих ноутбуков
            Map<String, String> parameters = new HashMap<>();//собираем изначальные минимальные параметры поиска
            boolean flag = true;

            System.out.println("""
                    ВЫБЕРИТЕ КРИТЕРИЙ ФИЛЬТРАЦИИ:
                    '0' - НАЙТИ по выбранным параметрам
                    '1' - цена
                    '2' - количество ядер в процессоре
                    '3' - объём оперативной памяти
                    '4' - цвет
                    '5' - время работы от аккумулятора
                    '6' - диагональ""");

            parameters.put("1", "0");
            parameters.put("2", "0");
            parameters.put("3", "0");
            parameters.put("4", "");
            parameters.put("5", "0");
            parameters.put("6", "0");

            /*Цикл записывает все параметры в map*/
            while (flag) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Выберите вариант:_");
                String answer1 = sc.nextLine();
                if (answer1.equals("0")) {
                    flag = false;
                } else {
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Минимальное желаемое значение:_");
                    String answer2 = sc2.nextLine();

                    for (String item: parameters.keySet()) {
                        if (answer1.equals(item)) {
                            parameters.put(answer1, answer2);
                        }
                    }

                }
            }

            /*Цикл сравнивает параметры поиска*/
            for(Laptop item: laptops) {
                if(item.getPrice() >= Integer.parseInt(parameters.get("1")) &&
                        item.getCores() >= Integer.parseInt(parameters.get("2")) &&
                        item.getRAM() >= Integer.parseInt(parameters.get("3")) &&
                        item.getBatteryLife() >= Integer.parseInt(parameters.get("5")) &&
                        (item.getColour().equals(parameters.get("4")) || parameters.get("4").equals("")) &&
                        item.getDiagonal() >= Double.parseDouble(parameters.get("6")))
            {
                    results.add(item);
                }
            }

            if (results.isEmpty()) {
                System.out.println("Подходящий ноутбук не найден");
            }

            System.out.println("РЕЗУЛЬТАТЫ ПОИСКА:");
            System.out.println(results.toString());

            }

        }


