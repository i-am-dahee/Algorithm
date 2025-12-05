import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int firstScore = 0;
        int secondScore = 0;
        int thirdScore = 0;
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            
            if (answers[i] == first[i % first.length]) {
                firstScore++;
            }
            
            if (answers[i] == second[i % second.length]) {
                secondScore++;
            }
            
            if (answers[i] == third[i % third.length]) {
                thirdScore++;
            }
        }
        
        int maxScore = Math.max(firstScore, Math.max(secondScore, thirdScore));
        
        List<Integer> list = new ArrayList<>();
        
        if (maxScore == firstScore) { list.add(1); }
        if (maxScore == secondScore) { list.add(2); }
        if (maxScore == thirdScore) { list.add(3); }
    
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}