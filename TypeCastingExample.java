public class TypeCastingExample {
    public static void main(String[] args) {
        // Widening (automatic)
        int num = 10;
        double d = num;  // int → double
        System.out.println("Widening (int to double): " + d);

        // Narrowing (explicit)
        double pi = 3.14;
        int i = (int) pi;  // double → int
        System.out.println("Narrowing (double to int): " + i);
    }
}
