public class 875_koko_eating_banana {
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // find max pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                ans = mid;
                right = mid - 1; // try smaller k
            } else {
                left = mid + 1;  // need bigger k
            }
        }

        return ans;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k; // ceil(pile / k)
        }

        return hours <= h;
    }
}
}
