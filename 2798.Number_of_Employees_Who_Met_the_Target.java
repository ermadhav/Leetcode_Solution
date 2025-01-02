class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n =0;
        for(int i=0; i < hours.length; i++){
            if(hours[i] >= target){
                n++ ;
            }
        }
        return n;
    }
}

// Use your basic Problem soving skills