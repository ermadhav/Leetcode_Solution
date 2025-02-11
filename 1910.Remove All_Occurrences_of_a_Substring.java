class solution {
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {  // Keep removing while "part" exists in "s"
            int index = s.indexOf(part);  // Find the first occurrence
            s = s.substring(0, index) + s.substring(index + part.length());  // Remove it
        }
        return s;
    }
}