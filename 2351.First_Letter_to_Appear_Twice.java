import java.util.HashSet;
import java.util.Set;

class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();
    for (char c : s.toCharArray()) {
        if (!seen.add(c)) return c;
    }
    return ' '; // Won't reach here as input guarantees a duplicate
    }
}