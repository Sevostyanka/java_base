import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(2, "two");
        db.put(1, "one");
        db.putIfAbsent(2, "twoooo");
        System.out.println(db);

        for (var item: db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }

    }
}