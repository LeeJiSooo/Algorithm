import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < 2 * arr[i]; j++){
                    list.add(arr[i]);
                }
            }else{
                for(int l = 0; l < arr[i]; l++){
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}