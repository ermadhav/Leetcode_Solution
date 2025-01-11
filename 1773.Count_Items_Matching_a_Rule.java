import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;

         // Iterate through each item
        for(int i=0; i<items.size(); i++){
            switch(ruleKey){
                case "type": // If ruleKey is "type", check the first element
                if(items.get(i).get(0).equals(ruleValue)){
                    count++;
                }
                break;
                case "color":// If ruleKey is "color", check the second element
                if(items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
                break;
                case "name":
                if(items.get(i).get(2).equals(ruleValue)){
                    count++;
                }
                break;
            }
        }
        return count;
    }
}