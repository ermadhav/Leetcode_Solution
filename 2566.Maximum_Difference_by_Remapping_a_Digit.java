class Solution {
    public int minMaxDifference(int num) {
        // Convert the number to string for easy digit manipulation
        String s = String.valueOf(num);
        
        // Find the first digit which is not '9' to maximize the number
        char firstNonNine = '9';
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '9'){
                firstNonNine = s.charAt(i);
                break;
            }
        }

        // StringBuilder to store the maximum and minimum numbers
        StringBuilder maxSb = new StringBuilder();
        StringBuilder minSb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            // Replace all occurrences of firstNonNine with '9' for maximum
            char ch1 = (s.charAt(i) == firstNonNine) ? '9' : s.charAt(i);
            maxSb.append(ch1);
            
            // Replace all occurrences of the first digit with '0' for minimum
            char ch2 = (s.charAt(0) == s.charAt(i)) ? '0' : s.charAt(i);
            minSb.append(ch2);
        }

        // Return the difference between the maximum and minimum numbers
        return Integer.parseInt(maxSb.toString()) - Integer.parseInt(minSb.toString());
    }
}
