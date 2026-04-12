public class 374_Guess Number Higher Or Lower {
    public class Solution extends GuessGame {
    public int guessNumber(int n) {
         int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int res = guess(mid);

            if (res == 0) {
                return mid; // found
            } else if (res == -1) {
                right = mid - 1; // too high
            } else {
                left = mid + 1;  // too low
            }
        }

        return -1; // should never reach
    }
}
}
