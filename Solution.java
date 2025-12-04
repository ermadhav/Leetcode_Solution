import java.util.*;

public class Solution {

    // Function to sort arr1 based on the order defined in arr2
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Map to store the ordering of elements in arr2
        // Key = value from arr2, Value = its index (priority for sorting)
        Map<Integer, Integer> order = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            order.put(arr2[i], i);
        }

        // Stream arr1, convert to boxed type for custom sorting
        return Arrays.stream(arr1)
                .boxed()
                // Custom comparator
                .sorted((a, b) -> {
                    // Get order index of each element, or MAX_VALUE if not in arr2
                    int orderA = order.getOrDefault(a, Integer.MAX_VALUE);
                    int orderB = order.getOrDefault(b, Integer.MAX_VALUE);

                    // If both elements have different order positions, sort by that
                    if (orderA != orderB) {
                        return orderA - orderB;
                    }

                    // Otherwise, sort by natural order (ascending)
                    return a - b;
                })
                // Convert boxed Integer stream back to int[]
                .mapToInt(i -> i)
                .toArray();
    }
}
