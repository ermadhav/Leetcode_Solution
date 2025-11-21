class Solution {
    public int largestInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Step 1: Separate digits by parity
        for (char c : arr) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }

        // Step 2: Sort each group in descending order
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        // Step 3: Rebuild the number
        int evenIndex = 0;
        int oddIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                sb.append(even.get(evenIndex++));
            } else {
                sb.append(odd.get(oddIndex++));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}