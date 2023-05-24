import java.util.Arrays;
import java.util.HashSet;

public class HashSetAsMnoj {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(u);
        System.out.println(r);
        System.out.println(s);
        boolean res = a.addAll(b);
        System.out.println(res);
    }
}
