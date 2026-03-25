import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        
        List<String> moreList = Arrays.asList(morse);
        
        StringBuilder sb = new StringBuilder();
        
        String[] words = letter.split(" ");
        
        for(String word : words){
            int index = moreList.indexOf(word);
            sb.append((char)(index + 'a'));
        }
        return sb.toString();
    }
}