

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] events = new int[N][2];

        for(int i = 0; i < N; i++){
            events[i][0] = sc.nextInt();
            events[i][1] = sc.nextInt();
        }

        Arrays.sort(events, (o1, o2) ->{
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }else{
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int lastEndTime = 0;

        for(int i = 0; i < N; i++){
            int currentStart = events[i][0];
            int currentEnd = events[i][1];

            if(currentStart >= lastEndTime){
                count++;
                lastEndTime = currentEnd;
            }
        }
        System.out.println(count);
    }
}
