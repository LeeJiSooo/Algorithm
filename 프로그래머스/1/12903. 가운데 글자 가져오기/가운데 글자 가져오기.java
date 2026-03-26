import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        
        if(len % 2 == 0){
            char c1 = s.charAt(len / 2 - 1);
            sb.append(String.valueOf(c1));
            char c2 = s.charAt(len / 2);
            sb.append(String.valueOf(c2));
        }else{
            char c = s.charAt(len / 2);
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}