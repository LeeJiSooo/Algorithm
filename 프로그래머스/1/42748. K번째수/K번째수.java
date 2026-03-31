import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int o = 0;
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int order = commands[i][2];
            
            int[] temp = new int[end - start + 1];
            int k = 0;
            for(int j = start; j <= end; j++){
                temp[k] = array[j - 1];
                k++;
            }
            Arrays.sort(temp);
            answer[o] = temp[order-1];
            o++;
        }
        return answer;
    }
}