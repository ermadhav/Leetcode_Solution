class Solution {
    public int minimumFlips(int n) {
    
        // converting int into binary
    String s=Integer.toBinaryString(n);
    int i=0;
    int j=s.length()-1;
    int count =0;

    // comparing bits from front and bakc
    while(i<j){

        // if diff then needs to be filled
        if(s.charAt(i) != s.charAt(j)){
            count +=2;
        }

        // it will help to move towrds center
        i++;
        j--;
    }
    return count;
    }
}