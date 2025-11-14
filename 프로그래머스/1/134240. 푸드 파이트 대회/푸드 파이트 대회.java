class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            
            for (int j = 0; j < food[i] / 2; j++) {
                
                sb1.append(i);
            }
        }
        sb2.append(sb1).reverse();
        
        return sb1.append(0).append(sb2).toString();
    }
}