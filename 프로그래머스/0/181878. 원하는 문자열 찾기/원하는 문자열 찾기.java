class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStringUpper = myString.toUpperCase();
        String myStringLower = myString.toLowerCase();
        String patUpper = pat.toUpperCase();
        String patLower = pat.toLowerCase();
        
        if(myStringUpper.contains(patUpper) || myStringLower.contains(patUpper) ||
          myStringUpper.contains(patLower) || myStringLower.contains(patLower)){
            answer = 1;
        }
        return answer;
    }
}