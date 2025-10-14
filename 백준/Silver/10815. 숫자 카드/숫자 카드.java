

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 상근이가 가지고 있는 카드의 수 N
        int N = sc.nextInt();
        Set<Integer> cardSet = new HashSet<>();

        for(int i = 0; i < N; i++){
            cardSet.add(sc.nextInt());
        }

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int input = sc.nextInt();
            if(cardSet.contains(input)){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString().trim());

    }
}
