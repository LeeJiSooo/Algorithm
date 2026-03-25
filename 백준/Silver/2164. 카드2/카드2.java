

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] queue = new int[2 * num];
        int first = 0;
        int last = 0;

        for(int i = 1; i <= num; i++){
            queue[last] = i;
            last++;
        }

        while((last - first) > 1){
            first++;
            queue[last] = queue[first];
            last++;
            first++;
        }
        System.out.print(queue[first]);
    }
}
