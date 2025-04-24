class Solution {
    public double trimMean(int[] arr) {
       for(int i=0; i<arr.length; i++) {
        for(int j=1; j<arr.length-i; j++){
            if(arr[j-1] < arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
       }

       int  l = arr.length;
       int trim = l/20;

       int add = 0;
       for(int i=trim; i<arr.length-trim; i++){
        add += arr[i];
       }

       return (double) add/(l-2 * trim);
    }
}