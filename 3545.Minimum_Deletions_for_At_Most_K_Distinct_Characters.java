public int minDeletions(String s, int k) {
    int[] freq = new int[26];
    for (char c : s.toCharArray()) freq[c - 'a']++;  // count each char

    List<Integer> list = new ArrayList<>();
    for (int f : freq) if (f > 0) list.add(f);       // collect frequencies

    if (list.size() <= k) return 0;                  // already ≤ k distinct chars

    Collections.sort(list);                          // sort ascending
    int deletions = 0, remove = list.size() - k;     // how many char types to remove

    for (int i = 0; i < remove; i++)
        deletions += list.get(i);                    // delete smallest freq chars

    return deletions;
}
