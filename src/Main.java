public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Eşit mi (==)
        System.out.println("a == b: " + (a == b)); // false

        // Eşit değil mi (!=)
        System.out.println("a != b: " + (a != b)); // true

        // Büyük mü (>)
        System.out.println("a > b: " + (a > b)); // false

        // Küçük mü (<)
        System.out.println("a < b: " + (a < b)); // true

        // Büyük veya eşit mi (>=)
        System.out.println("a >= b: " + (a >= b)); // false

        // Küçük veya eşit mi (<=)
        System.out.println("a <= b: " + (a <= b)); // true

        // String karşılaştırması
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false
    }
}