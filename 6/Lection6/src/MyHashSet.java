import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();
        set.add(1); set.add(12); set.add(123); set.add(1234); set.add(1234); set.add(null);
        set.remove(12);
        set.clear();
        System.out.println(set);
    }
}