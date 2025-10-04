

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < num; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        for(int i = 0; i  < list.size(); i++){
            sb.append(list.get(i)).append('\n');
        }

        System.out.println(sb.toString());
    }
}
