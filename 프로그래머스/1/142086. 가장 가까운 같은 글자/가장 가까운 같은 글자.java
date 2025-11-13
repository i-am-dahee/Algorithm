class Solution {
    public int[] solution(String s) {
        
        String[] word = s.split("");
        int[] result = new int[word.length];
        
        for (int i = 0; i < word.length; i++) {
            result[i] = -1;
            
            for (int j = i - 1; j >= 0; j--) {
                
                if (word[i].equals(word[j])) {
                    result[i] = i - j;
                    break;
                }
            }
        }
        
        return result;
    }
}