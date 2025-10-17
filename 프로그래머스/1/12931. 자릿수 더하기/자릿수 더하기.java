import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
//         String s = Integer.toString(n);
//         int sum = 0;
        
//         for(int i = 0; i < s.length(); i ++){
//             char c = s.charAt(i);
//             String temp = String.valueOf(c);
//             sum += Integer.parseInt(temp);
//         }
        
        while(n > 0){
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
}