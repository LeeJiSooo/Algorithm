import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        
        String[] arr = s.split("");
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        
        for(String ss : arr){
            sb.append(ss);
        }
        
        sb.reverse();
        
        answer = Long.valueOf(sb.toString());
        return answer;

    }
}