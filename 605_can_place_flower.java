public class 605_can_place_flower {
    class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
          int len = flowerbed.length;
        
        for (int i = 0; i < len; i++) {
            
            if (flowerbed[i] == 0) {
                
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;   // plant flower
                    n--;
                    
                    if (n == 0) return true;
                    
                    i++; // skip next position
                }
            }
        }
        
        return n <= 0;
    }
}
}
