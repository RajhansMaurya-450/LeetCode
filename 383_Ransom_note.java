class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        // Step 1: count magazine letters
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: try to build ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false; // not enough letters
            }
            freq[c - 'a']--;
        }

        return true;
    }
}