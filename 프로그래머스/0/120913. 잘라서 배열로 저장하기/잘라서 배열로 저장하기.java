import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        int i;
        for(i = 0; i <= my_str.length() - n; i = i + n){
            String str = my_str.substring(i, i + n);
            list.add(str);
        }
        
        if(i < my_str.length()){
            list.add(my_str.substring(i));
        }
        
        String[] answer = new String[list.size()];
        
        
        for(int k = 0; k < list.size(); k++){
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}