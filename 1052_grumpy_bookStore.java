class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
         int n = customers.length;

        // Step 1: already satisfied
        int base = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        // Step 2: sliding window for extra gain
        int extra = 0;

        // first window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        int maxExtra = extra;

        // slide window
        for (int i = minutes; i < n; i++) {

            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        return base + maxExtra;
    }
}
// sliding window problem