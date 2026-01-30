public class 3_max_substring {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[128];
        int ls = 0;
        int maxLen = 0;
        for(int rs = 0 ; rs < s.length(); rs++){
            while(freq[s.charAt(rs)] > 0) {
                freq[s.charAt(ls)]--;
                ls++;
            }
            freq[s.charAt(rs)]++;
            maxLen = Math.max(maxLen,rs-ls+1);
        }
        return maxLen;
    }
}
}
