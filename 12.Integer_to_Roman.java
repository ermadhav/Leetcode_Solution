public class RomanConverter {
    public String intToRoman(int num) {
        // Values of Roman numerals in descending order, including subtractive cases
        int[] vals =    {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};
        // Corresponding Roman numeral symbols
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // Use StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();

        // Loop through each value-symbol pair
        for (int i = 0; i < vals.length; i++) {
            // While the current Roman value fits into the remaining number
            while (num >= vals[i]) {
                num -= vals[i];           // Subtract the Roman value from the number
                sb.append(romans[i]);     // Append the corresponding Roman symbol
            }
        }

        // Return the built Roman numeral as a string
        return sb.toString();
    }
}
