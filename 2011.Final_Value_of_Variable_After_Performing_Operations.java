class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        // Traversing all element 
        for(int i = 0; i < operations.length; i++ ){

            // Check if the operation is an increment operation (++X or X++)
            if(operations[i].equals("++X") || operations[i].equals("X++")) {
                X++ ;
            } 
            
            // Check if the operation is a decrement operation (--X or X--)            
            else if (operations[i].equals("--X") || operations[i].equals("X--")){
                X--;
            }
        }
        return X;
    }
}