// Approach --> 1 

// class Solution {
//     public int minAddToMakeValid(String s) {
//         Stack<Character> stack = new Stack<>();
        
//         // Go through each character in the string
//         for(char ch : s.toCharArray()){
//             if(ch == ')'){
//                 // If we find a matching '(', remove it from stack
//                 if(!stack.isEmpty() && stack.peek() == '('){
//                     stack.pop();
//                 }else{
//                     // No matching '(', so push ')' to stack
//                     stack.push(ch);
//                 }
//             }else{
//                 // Push '(' to stack
//                 stack.push(ch);
//             }
//         }
        
//         // Remaining items in stack are unmatched, so return their count
//         return stack.size();
//     }
// }

// Approach --> 2


class Solution {
    public int minAddToMakeValid(String s) {
        int count =0; // unmatched '('
        int ans =0; // needed ')'
        for(char c:s.toCharArray()){
            if(c == '('){
                count++;
            }else{
                if(count >0){
                    count--; // if matches with "("
                }else{
                    ans++; // needed '('
                }
            }
        }
        return ans+count;
    }
}