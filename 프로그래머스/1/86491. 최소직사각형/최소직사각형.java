import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for (int[] row : sizes) {
            Arrays.sort(row);
            width = Math.max(width, row[0]);
            height = Math.max(height, row[1]);
        }
        
        return width * height;
    }
}