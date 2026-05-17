public class 1422_Maximum_score_after_splitting_string {
    class Solution {
    public int maxScore(String s) {
        int ones = 0;

        // Count total ones
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        int zeros = 0;
        int maxScore = 0;

        // Split before last character
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }

            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;  
    }//1422_Maximum_score_after_splitting_string
}
}
