import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2809);
        list.add("Kathrin");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}