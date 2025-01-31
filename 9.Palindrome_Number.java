class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder reversedStr = new  StringBuilder(str);
        reversedStr.reverse();
        return str.equals(reversedStr.toString());
    }
}