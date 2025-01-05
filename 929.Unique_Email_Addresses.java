// import java.util.HashSet; (optional)

class Solution {
    public int numUniqueEmails(String[] emails) {

        //Created a hash map to store a unique mail
        HashSet<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            // Split the array into local and domain 
            String[] parts = email.split("@");

            // Remove everything after the first '+' 
            // and remove all '.' from the local part
            String local = parts[0].split("\\+")[0].replace(".", "");
            // Combining the prossessed the array
            uniqueEmails.add(local + "@" + parts[1]);
        }
        
        return uniqueEmails.size();
    }
}
