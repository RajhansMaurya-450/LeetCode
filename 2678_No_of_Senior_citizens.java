public class 2678_No_of_Senior_citizens {
    class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

    for (String s : details) {
        int age = Integer.parseInt(s.substring(11, 13));
        if (age > 60) count++;
    }

    return count;
    }
}
}
