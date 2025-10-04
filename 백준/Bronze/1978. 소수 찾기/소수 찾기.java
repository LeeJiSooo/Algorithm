import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] list = new int[num];
        int sum = 0;

        for(int i = 0; i < num; i++){
            list[i] = sc.nextInt();
            int s = 0;
            for(int j = 1; j <= list[i]; j++){
                if(list[i] % j == 0){
                    s++;
                }
            }
            if(s == 2){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
