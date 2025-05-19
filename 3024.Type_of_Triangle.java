class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];

        // Check if the sides can't form a triangle
        if(a + b <= c || b + c <= a || c + a <= b){
            return "none";
        }

        // Check if all sides are equal
        if(a == b && a == c){
            return "equilateral";
        }
        // Check if any two sides are equal
        else if(a == b || b == c || c == a){
            return "isosceles";
        }
        // All sides are different
        else{
            return "scalene";
        }
    }
}
