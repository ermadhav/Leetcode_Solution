import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int n = left; n <= right; n++)
            if (isSelfDividing(n)) res.add(n);
        return res;
    }
    
    private boolean isSelfDividing(int n) {
        for (int x = n; x > 0; x /= 10)
            if (x % 10 == 0 || n % (x % 10) != 0) return false;
        return true;
    }
}
