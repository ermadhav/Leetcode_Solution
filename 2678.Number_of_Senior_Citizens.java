class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i=0; i<details.length; i++){
        String newDetails = details[i].substring(11,13);
        int numeric = Integer.parseInt(newDetails);
        if( numeric > 60){
            count++;
        }
        }
        return count;
    }
}