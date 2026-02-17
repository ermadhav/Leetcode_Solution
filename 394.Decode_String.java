class Solution {
    public String decodeString(String s) {

        Stack<Integer> num = new Stack<>();   // store repeat counts
        Stack<String> str = new Stack<>();    // store previous strings
        String res = "";                      // current result
        int k = 0;                            // current number

        for(char c : s.toCharArray()){

            if(Character.isDigit(c))
                k = k*10 + c-'0';             // build number (for cases like 12[a])

            else if(c == '['){
                num.push(k);                  // push repeat count
                str.push(res);                // push current string
                k = 0;                        // reset number
                res = "";                     // reset result
            }

            else if(c == ']'){
                String temp = str.pop();      // get last stored string
                int count = num.pop();        // get repeat count
                for(int i=0;i<count;i++)
                    temp += res;              // repeat current string
                res = temp;                   // update result
            }

            else
                res += c;                     // add character to result
        }

        return res;                           // final decoded string
    }
}
