import java.lang.*;
import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder(); //짝수
        StringBuilder sb2 = new StringBuilder(); //홀수
        
        int len = num_list.length;
        
        for(int i = 0; i < len; i++){
            int n = num_list[i];
            if(n % 2 == 0){
                sb1.append(Integer.toString(n));
            }else{
                sb2.append(Integer.toString(n));
            }
        }
        
        answer = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        
        return answer;
    }
}