public class 1700_No_of_student_unable_to_eat_lunch {
    class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         int[] count = new int[2];

        // Count student preferences
        for (int s : students) {
            count[s]++;
        }

        // Process sandwiches
        for (int sandwich : sandwiches) {

            // No student wants this sandwich
            if (count[sandwich] == 0) {
                break;
            }

            count[sandwich]--;
        }

        return count[0] + count[1];
    }
}
}
