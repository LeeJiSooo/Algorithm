import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int n = my_string.length();
        int start = c - 1; // c는 1-based

        for (int i = start; i < n; i += m) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}