import java.util.*;
class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 0);
            }
        }
        
        List<Character> list = new ArrayList<>();
        
        for(char key : map.keySet()){
            if(map.get(key) == 0){
                list.add(key);
            }
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}