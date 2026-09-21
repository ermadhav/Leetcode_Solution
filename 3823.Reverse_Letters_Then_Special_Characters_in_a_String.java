class Solution {
    public String reverseByType(String s) {
        List<Character> letter = new ArrayList<>();
        List<Character> special = new ArrayList<>();

        // separing letter and special
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                letter.add(ch);
            }else{
                special.add(ch);
            }
        }

        // reverse letter and special
        Collections.reverse(letter);
        Collections.reverse(special);

        // putting the reverse letter and special in og order
        StringBuilder ans = new StringBuilder();
        int l=0;
        int spcl =0;
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                ans.append(letter.get(l));
                l++;
            }else{
                ans.append(special.get(spcl));
                spcl++;
            }
        }
        return ans.toString();
    }
}