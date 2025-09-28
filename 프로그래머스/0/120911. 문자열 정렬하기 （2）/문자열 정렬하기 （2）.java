import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        String lower = my_string.toLowerCase();
        
        char[] chars = lower.toCharArray();
        
        Arrays.sort(chars);
        
        String answer = new String(chars);
        return answer;
    }
}