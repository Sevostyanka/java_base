import java.util.Arrays;

/*На первой строке записывается натуральное число n - количество строчек в книге.
Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов,
на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2",
где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт,
на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
название продуктов написаны строчными буквами. Гарантируется, что продукты,
на которые нужно выполнить замену, не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить
написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его.
Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его.
Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни*/
public class task2 {
    static String[] parsStr(String a) { //ф-ция парсинга строки, выдает массив str
        String[] arr = a.split(" - ");
        return arr;
    }
    public static void main(String[] args) {
        int n = 2;
        String book[] = new String[n]; //создали массив строк, в котором будем менять звачения
        book[0] = "Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его.\n" +
                "Посыпьте измельчённый арахис на мороженое.";
        book[1] = "Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";

        System.out.print(Arrays.toString(book)); //распечатали первичный массив
        System.out.println("\n");

        int m = 3; //создали массив данных о продуктах, что на что заменяем
        String prodStr[] = new String[] {"арахис - колбаса","клубника - вишня","сгущенка - молоко"};
        String[][] products = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                products[i][j] = parsStr(prodStr[i])[j];
            }
        }

        String[] finalyResult = new String[book.length];
        //создали пустой массив, чтоб поместить туда конечный результат

        for (int i = 0; i < book.length; i++) {
            //пытаемся заменить подстроки одну на другую. Не заменяется!!!
            for (int j = 0; j < m; j++) {
                if (book[i].contains(products[j][0])==true) {
                    finalyResult[i] = book[i].replace(products[j][0], products[j][1]);
                }
            }
        }

        System.out.print(Arrays.toString(finalyResult));
        System.out.println("\n");
        System.out.println(Arrays.deepToString(products));

    }
}
