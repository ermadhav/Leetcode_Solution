public class Base7Converter {
    public static String convertToBase7(int num) {
        // Using built-in Integer.toString() method with radix 7
        return Integer.toString(num, 7);
    }
}
