
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;

        for(int i = 0; i < sorted.length; i++){
            if(!rankMap.containsKey(sorted[i])){
                rankMap.put(sorted[i], rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < origin.length; i++){
            sb.append(rankMap.get(origin[i])).append(" ");
        }

        System.out.println(sb);
    }
}
