public class 2264_Largest 3-Same-Digit Number in String {
    class Solution {
    public String largestGoodInteger(String num) {
        for (char d = '9'; d >= '0'; d--) {
            String triple = "" + d + d + d;
            if (num.contains(triple)) {
                return triple;
            }
        }
        return "";
    }
}
}
