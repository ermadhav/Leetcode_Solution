// Approach ---> 1

// class Solution {
//     public int numberOfCuts(int n) {
//         // If there's only 1 slice, no cuts are needed
//         if (n == 1) return 0;
        
//         // If n is even, number of cuts is n/2
//         if (n % 2 == 0) return n / 2;
        
//         // If n is odd, number of cuts equals n
//         return n;
//     }
// }


// Approach ---> 2

class Solution {
    public int numberOfCuts(int n) {
        // if n == 1 return 0 because there is no way to to cut circle in one part
        if(n == 1) return 0;
        // if no. of cuts is even return the half of n because total cuts need is half of n
        if(n%2 == 0){
            return n/2;
        }
        // else n is odd then return n as it is 
        return n;
    }
}