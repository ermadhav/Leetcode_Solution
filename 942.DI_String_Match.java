class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
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
        list.add(low);
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}