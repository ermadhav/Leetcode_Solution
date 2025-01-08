class Solution {
    public int countSeniors(String[] details) {
        int count =0;

        //Iterating Through details using for loop
        for(int i=0; i<details.length; i++){

        // Getting the age from the details using .substring()    
        String newDetails = details[i].substring(11,13);

        // Storing the age in numeric
        int numeric = Integer.parseInt(newDetails);

        // Checking if age is > 60
        if( numeric > 60){
            count++; // Increasing the count if age is greater than 60
        }
        }
        return count;
    }
}