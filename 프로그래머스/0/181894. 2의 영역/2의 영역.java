import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                list.add(i);
            } 
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        int first = list.get(0);
        int last = list.get(list.size() - 1);
        int num = last - first + 1;
        
        int[] answer = new int[num];
        
        int j = 0;
        for(int i = first; i <= last; i++){
            answer[j] = arr[i];
            j++;
        }
        
        return answer;
    }
}