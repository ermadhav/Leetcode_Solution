class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n+1;
        ArrayList list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c == 'I'){
                list.add(low);
                low++;
            }else{
                list.add(high);
                high--;
            }
        }
        int[] ans = new int[list.size()+1];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}