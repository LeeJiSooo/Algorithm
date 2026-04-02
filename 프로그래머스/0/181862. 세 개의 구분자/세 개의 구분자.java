import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        
        
        ArrayList<String> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : myStr.toCharArray()){
            if(c == 'a' || c == 'b' || c == 'c'){
                if(sb.length() > 0){
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }else{
                sb.append(c);
            }
        }
        
        if(sb.length() > 0){
            list.add(sb.toString());
        }
     
        String[] answer;
        
        if(list.size() == 0){
            answer = new String[]{"EMPTY"};
        }else{
            answer = new String[list.size()];
            
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}