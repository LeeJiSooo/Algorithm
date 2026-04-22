import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> stk = new ArrayList<>();
        
        int len = arr.length;
        
        for(int i = 0; i < len; i++){
            if(stk.size() == 0){
                stk.add(arr[i]);
            }else{
                if(stk.get(stk.size() - 1) == arr[i]){
                    stk.remove(stk.size() - 1);
                }else{
                    stk.add(arr[i]);
                }
            }
        }
        
        int[] answer = new int[stk.size()];
        
        for(int i = 0; i < stk.size(); i++){
            answer[i] = stk.get(i);
        }
        
        if(answer.length == 0){
            return new int[]{-1};
        }
        
        return answer;
    }
}