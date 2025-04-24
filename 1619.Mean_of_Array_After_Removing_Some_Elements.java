class Solution {
    public double trimMean(int[] arr) {
       // Bubble Sort: Sorting the array in descending order (largest to smallest)
       for(int i=0; i<arr.length; i++) {
           for(int j=1; j<arr.length-i; j++){
               // Swap if the previous element is smaller than the current element
               if(arr[j-1] < arr[j]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
           }
       }

       // Get the length of the array
       int  l = arr.length;
       
       // Calculate how many elements to trim from both ends (1/20th of the array length)
       int trim = l / 20;

       // Initialize variable to sum up the remaining elements after trimming
       int add = 0;

       // Loop through the array, starting from the trimmed elements, and sum up the remaining elements
       for(int i=trim; i<arr.length-trim; i++){
           add += arr[i];  // Add the element to the sum
       }

       // Return the average (mean) of the remaining elements after trimming
       // Cast the result to double to handle decimal places correctly
       return (double) add / (l - 2 * trim);  // Divide the sum by the number of elements left after trimming
    }
}
