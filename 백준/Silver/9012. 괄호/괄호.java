

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String s = br.readLine();

            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);

                if (c == '(') {
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        isVPS = false;
                        break;
                    }

                    stack.pop();
                }
            }
            if(isVPS && stack.isEmpty()){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}
