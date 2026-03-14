public class 2379_minimum_recolor { //minimum recolor for k consecutive black block
    class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;

        // first window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }

        int minOps = whiteCount;

        // sliding window
        for (int i = k; i < blocks.length(); i++) {

            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }

            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }

            minOps = Math.min(minOps, whiteCount);
        }

        return minOps;
    }
}
}
