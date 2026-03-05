import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        char[] arr = n.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        System.out.println(sb.reverse().toString());
    }
}
