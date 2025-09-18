public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println("a & b: " + (a & b));  // AND → 1
        System.out.println("a | b: " + (a | b));  // OR  → 7
        System.out.println("a ^ b: " + (a ^ b));  // XOR → 6
        System.out.println("~a: " + (~a));        // NOT → -6
        System.out.println("a << 1: " + (a << 1)); // Left shift → 10
        System.out.println("a >> 1: " + (a >> 1)); // Right shift → 2
    }
}
