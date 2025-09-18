public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing (primitive → object)
        int num = 100;
        Integer obj = num;

        // Unboxing (object → primitive)
        int value = obj;

        // Wrapper class methods
        String str = "50";
        int parsed = Integer.parseInt(str);

        System.out.println("Autoboxing: " + obj);
        System.out.println("Unboxing: " + value);
        System.out.println("Parsed from String: " + parsed);
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer: " + Integer.MIN_VALUE);
    }
}
