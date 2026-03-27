

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int num = 0;
        int[] coin = new int[N];

        for(int i = 0; i < N; i++){
            coin[i] = sc.nextInt();
        }

        for(int i = N - 1; i >= 0; i--){
            if(N == 0){
                break;
            }
            num += K / coin[i];

            K = K % coin[i];
        }

        System.out.println(num);
    }
}
