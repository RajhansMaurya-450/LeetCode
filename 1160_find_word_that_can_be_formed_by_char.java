public class 1160_find_word_that_can_be_formed_by_char {
    class Solution {
    public int countCharacters(String[] words, String chars) {
       int[] charFreq = new int[26];

        // Count chars frequency
        for (char c : chars.toCharArray()) {
            charFreq[c - 'a']++;
        }

        int result = 0;

        // Check each word
        for (String word : words) {

            int[] wordFreq = new int[26];
            boolean good = true;

            // Count word frequency
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;

                // If exceeds available chars
                if (wordFreq[c - 'a'] > charFreq[c - 'a']) {
                    good = false;
                    break;
                }
            }

            if (good) {
                result += word.length();
            }
        }

        return result;   
    }
}
}
