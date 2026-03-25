

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] stack = new int[num];
        int top = -1;

        for(int i = 0; i < num; i++){
            int input = sc.nextInt();

            if(input == 0){
                top--;
            }else{
                top++;
                stack[top] = input;
            }
        }

        int sum = 0;
        for(int i = 0; i <= top; i++){
            sum += stack[i];
        }

        System.out.println(sum);
    }
}
