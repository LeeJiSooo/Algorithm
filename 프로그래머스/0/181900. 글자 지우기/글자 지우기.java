import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int inx : indices){
            list.add(inx);
        }
        
        for(int i = 0; i < my_string.length(); i++){
            if(! list.contains(i)){
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}