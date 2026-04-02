import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(String s : strArr){
            int len = s.length();
            
            if(!map.containsKey(len)){
                map.put(len, 1);
            }else{
                map.put(len, map.get(len) + 1);
            }
            
        }
        
        int max = 0;
        
        for(Integer i : map.keySet()){
            if(map.get(i) >= max){
                max = map.get(i);
            }
        }
        
        return max;
    }
}