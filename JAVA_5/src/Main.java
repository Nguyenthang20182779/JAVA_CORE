
public class Main {
    public static void main(String[] args) {
        Operator o1 = new Operator();
        Operator o2 = new Operator();

        int result1 = o1.Add(10, 10);
        double result2 = o2.Add(10.5, 10.9);

        System.out.println(result1);
        System.out.println(result2);
    }


}
