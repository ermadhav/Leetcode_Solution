class Solution {
    public String concatHex36(int n) {
        int square = n * n;           // Square of n
        int cube = n * n * n;         // Cube of n
        
        String hex = Integer.toHexString(square).toUpperCase();  // Square in Hex
        String base36 = Integer.toString(cube, 36).toUpperCase(); // Cube in Base36
        
        return hex + base36;          // Concatenate and return
    }
}
