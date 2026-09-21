// Approach ---> 2 

class Solution {
    public String finalString(String s) {
        // StringBuilder is used since it supports efficient append and reverse
        // operations
        StringBuilder sb = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                // If character is 'i', reverse the entire string built so far
                sb.reverse();
            } else {
                // Otherwise, append the character normally
                sb.append(c);
            }
        }

        // Convert StringBuilder to String and return the final result
        return sb.toString();
    }
}

// Approach ---> 2 

class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray())  {
            // if not I then append the char in ans
            if(ch != 'i'){
                ans.append(ch);
            }else{
                ans.reverse();
            }
        }
        return ans.toString();
    }
}