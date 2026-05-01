public class 2965_Find Missing and Repeated Values {
    class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int n = grid.length;
        int size = n * n;

        int[] freq = new int[size + 1];

        // Count frequency
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

        int repeat = -1, missing = -1;

        // Find repeating and missing
        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2) repeat = i;
            if (freq[i] == 0) missing = i;
        }

        return new int[]{repeat, missing};
    }
}
}
