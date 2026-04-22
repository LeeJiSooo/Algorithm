import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int x = 0;
        int[] currentArr = arr;
        
        while(true){
            int[] nextArr = new int[arr.length];
            
            for(int i = 0; i < arr.length; i++){
                int num = currentArr[i];
                if(num >= 50 && num % 2 == 0){
                    nextArr[i] = num / 2;
                }else if(num < 50 && num % 2 != 0){
                    nextArr[i] = num * 2 + 1;
                }else{
                    nextArr[i] = num;
                }
            }
            
            if(Arrays.equals(currentArr, nextArr)){
                break;
            }
            
            currentArr = nextArr;
            x++;
        }
        
        return x;
    }
}