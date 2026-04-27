
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] check;
    static int count = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        visited = new boolean[N + 1];
        check = new int[N + 1];

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph.get(s).add(e);
            graph.get(e).add(s);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        dfs(R);
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++){
            sb.append(check[i]).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static void dfs(int node){
        visited[node] = true;
        check[node] = count++;

        for(int next : graph.get(node)){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}
