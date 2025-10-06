import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                list.add(sum);
                sum = 0;
            }else{
                sum++;
            }
        }
        list.add(sum);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}