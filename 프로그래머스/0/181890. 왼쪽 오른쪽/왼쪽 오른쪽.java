import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
       
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++){
            String c = str_list[i];
            
            if(c.equals("l")){
                for(int l = 0; l < i; l++){
                    list.add(str_list[l]);
                }
                break;
            }else if(c.equals("r")){
                for(int l = i + 1; l < str_list.length; l++){
                    list.add(str_list[l]);
                }
                break;
            }
        }
        
         String[] answer = new String[list.size()];
        
         if(list.size() == 0){
             return new String[0];
         }
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}