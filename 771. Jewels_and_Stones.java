import java.util.HashSet;
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        // Use a set to store jewel types for fast lookup
        HashSet<Character> jewelSet = new HashSet<>();

        // Add each jewel to the set
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }

        int count = 0;

        // Go through each stone and check if it's a jewel
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }

        return count;
    }
}
