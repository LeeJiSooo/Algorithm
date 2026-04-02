import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        int min = arr[0];
        
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}