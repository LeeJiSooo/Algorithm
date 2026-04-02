import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] parts = s.split(" ");
        
        int first = Integer.parseInt(parts[0]);
        int min = first;
        int max = first;
        
        for(String str : parts){
            int num = Integer.parseInt(str);
            
            if(min > num){
                min = num;
            }
            
            if(max < num){
                max = num;
            }
        }
        
        sb.append(min).append(" ").append(max);
        
        return sb.toString();
    }
}