class Solution {
    public String reverseVowels(String s) {
        // Convert string to char array for easy swapping
        char[] arr = s.toCharArray();
        
        // String containing all vowels (both uppercase and lowercase)
        String vowels = "aeiouAEIOU";
        
        int i = 0, j = arr.length - 1; // Two pointers: start and end

        // Continue until the two pointers meet
        while (i < j) {
            // Move i forward until it finds a vowel
            while (i < j && vowels.indexOf(arr[i]) == -1) i++;
            
            // Move j backward until it finds a vowel
            while (i < j && vowels.indexOf(arr[j]) == -1) j--;
            
            // Swap the vowels at i and j
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
        
        // Return the new string after reversing vowels
        return new String(arr);
    }
}