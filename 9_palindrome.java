public class 9_palindrome {
    class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
         int rev_num = 0;
         int n = x;
        while(x > 0){
            rev_num = rev_num * 10 + x %10;
            x = x / 10;
        }
        if (rev_num == n){
            return true;
        }
        else{
            return false;
        }
        
    }
}
}
