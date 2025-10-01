public class Car {
    String brand;
    int year;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Honda";
        c1.year = 2020;

        Car c2 = new Car();
        c2.brand = "Tesla";
        c2.year = 2023;

        System.out.println(c1.brand + " - " + c1.year);
        System.out.println(c2.brand + " - " + c2.year);
    }
}
