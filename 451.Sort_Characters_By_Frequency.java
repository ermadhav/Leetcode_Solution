class Solution {
    public String frequencySort(String s) {
        HashMap<Character ,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));
        String ans = "";
        for(char ch : list){
            for(int i=0; i<map.get(ch); i++){
                ans += ch;
            }
        }
        return ans;
    }
}