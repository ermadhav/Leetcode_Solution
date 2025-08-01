class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        // Work backwards from (tx, ty) to (sx, sy)
        while (tx >= sx && ty >= sy) {
            if (tx == sx && ty == sy) return true;

            if (tx > ty) {
                if (ty > sy) tx %= ty;           // Reduce tx by ty
                else return (tx - sx) % ty == 0; // Check direct reachability in x direction
            } else {
                if (tx > sx) ty %= tx;           // Reduce ty by tx
                else return (ty - sy) % tx == 0; // Check direct reachability in y direction
            }
        }
        return false; // Cannot reach (sx, sy) from (tx, ty)
    }
}
