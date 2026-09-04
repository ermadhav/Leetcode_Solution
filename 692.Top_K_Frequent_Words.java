class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String word :words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        // Store all unique words
        List<String> list = new ArrayList<>(map.keySet());

        // Sort:
        // 1. Higher frequency first
        // 2. Same frequency -> lexicographical order
        list.sort((a,b) -> {
            if(!map.get(b).equals(map.get(a))){
                return map.get(b) - map.get(a);
            }else{
                return a.compareTo(b);
            }
        });
        List<String> ans = new ArrayList<>();

        // Take first k words
        for (int i = 0; i < k; i++) {
            ans.add(list.get(i));
        }

        return ans;

    }
}