public class 1299_selection_sort {
    class Solution {
    public int[] replaceElements(int[] arr) {
        int maxsoFar = -1;
        for (int i = arr.length - 1; i >= 0; i--){
        int current = arr[i];
         arr[i] = maxsoFar;
         maxsoFar = Math.max(maxsoFar,current);
        }
        return arr;
    }
}
}
