public class test {
    public static void main(String[] args) {
        String a = "Была весна красна, краше прежнего стала, омывшись посленим снегом.";
        String b = "прекрасна";
        String c = "красна";
//        if (a.contains(c)) {
            String g = a.replace(c, b);
//        }
        System.out.println(g);
    }
}
