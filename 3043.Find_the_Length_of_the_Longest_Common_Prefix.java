class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max = 0;
        HashSet<String> set = new HashSet<>();

        for (int num1 : arr1) {
            String s1 = String.valueOf(num1);
            for (int i = 1; i <= s1.length(); i++) {
                set.add(s1.substring(0, i));
            }
        }

        for (int num2 : arr2) {
            String s2 = String.valueOf(num2);
            int len = s2.length();
            int count = 0;

            for (int i = 0; i < len; i++) {
                if (set.contains(s2.substring(0, i + 1))) {
                    count++;
                } else {
                    break;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}