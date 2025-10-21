import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int len = myString.length();
        
        for(int i = 0; i < len; i++){
            char c = myString.charAt(i);
            if(c == 'x'){
               if(sb.length() > 0) {         // 빈 문자열은 제외
                    list.add(sb.toString());  // 문자열로 변환 후 추가
                    sb = new StringBuilder(); // 초기화
                }
            }else{
                sb.append(c);
            }
        }
        
        if(sb.length() > 0){
            list.add(sb.toString());
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}