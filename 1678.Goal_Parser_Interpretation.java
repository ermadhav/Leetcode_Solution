class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder(); // To store the final output

        for (int i = 0; i < command.length(); ) {
            if (command.charAt(i) == 'G') {
                result.append('G'); // "G" stays "G"
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result.append('o'); // "()" becomes "o"
                i += 2;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                result.append("al"); // "(al)" becomes "al"
                i += 4;
            }
        }

        return result.toString(); // Return the final string
    }
}
