import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] num = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < num.length; i ++){
            if(!(num[i].equals("Z"))){
                int number = Integer.parseInt(num[i]);
                list.add(number);
            }else{
                list.remove(list.size() - 1);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}