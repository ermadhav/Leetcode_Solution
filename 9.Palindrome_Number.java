class Solution {
    public boolean isPalindrome(int x) {
         // Convert the integer to string
         String str = Integer.toString(x);
        
         // Create a StringBuilder and reverse the string
         StringBuilder reversedStr = new StringBuilder(str);
         reversedStr.reverse();
         
         // Compare the original string with the reversed string
         return str.equals(reversedStr.toString());
    }
}