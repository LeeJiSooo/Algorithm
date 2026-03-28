import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        sb.append(my_string.substring(0, s));
        
        String sub = my_string.substring(s, e + 1);
        StringBuilder temp = new StringBuilder(sub);
        sb.append(temp.reverse().toString());
        
        sb.append(my_string.substring(e + 1));
        
        return sb.toString();
    }
}