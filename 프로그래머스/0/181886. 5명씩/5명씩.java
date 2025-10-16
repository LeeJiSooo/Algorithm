import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        int len = names.length;
        
        int first = 0;
        list.add(names[0]);
        
        for(int i = 0; i < len; i++){
            if(first == 5){
                list.add(names[i]);
                first = 0;
            }
            first++;
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}