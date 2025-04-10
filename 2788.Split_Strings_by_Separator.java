import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> result = new ArrayList<>();

        // Convert separator char to string
        String separatorStr = String.valueOf(separator);

        for (int i = 0; i < words.size(); i++) {

            // Split the word by the separator
            String[] newWords = words.get(i).split(Pattern.quote(separatorStr));

            // Only add non-empty parts to the result
            for (int j = 0; j < newWords.length; j++) {
                if (newWords[j].length() > 0) {
                    result.add(newWords[j]);
                }
            }

        }

        return result;
    }
}