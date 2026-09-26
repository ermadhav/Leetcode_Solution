class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        // will be used to store key value pair
        HashMap<String, String> map = new HashMap<>();
        for(List<String> x : knowledge){
            map.put(x.get(0), x.get(1));
        }
        StringBuilder ans = new StringBuilder();
        // traverse the string
        for(int i=0; i<s.length(); i++){
            // '(' is found, find the closing ')'
            if(s.charAt(i) == '('){
                int j=i+1;
                while(s.charAt(j) != ')'){
                    j++;
                }
                String key = s.substring(i+1, j);
                if(map.containsKey(key)){
                    ans.append(map.get(key));
                }else{
                    ans.append("?");
                }
                i=j;
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}