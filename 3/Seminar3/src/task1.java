//Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
public class task1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello"; //не создаёт новый объект, это ссылка
        String s3 = s1; // ссылки тоже равны
        String s4 = "h" + "e" + "l" + "l" + "o"; //на каждом этапе новый обьект,
        // но в конце не создадим новый, а получим ссылку на предыдущий такой же.
        //предыдущие обьекты удаляются гарбадж коллектором, удаляет те обьекты, на которые нет ссылок.
        //он автоматический
        String s5 = new String("hello"); //выделяется новый участок памяти
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});//тоже выделяется нов участок памяти


//        System.out.println(s1==s2); //true
//        System.out.println(s1==s3); //true
//        System.out.println(s1==s4); //true
//        System.out.println(s1==s5); //false
        System.out.println(s1==s6); //false
//
//        System.out.println(s1.equals(s6)); //true //если ссылки не совпадает, то смотрит содержимое.
    }
}