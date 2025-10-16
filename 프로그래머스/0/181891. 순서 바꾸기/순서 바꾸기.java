class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        int j = 0;
        for(int i = n; i < len; i++){
            answer[j] = num_list[i];
            j++;
        }
        for(int i = 0; i < n; i++){
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}