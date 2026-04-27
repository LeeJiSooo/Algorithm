import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] check;
    static int count = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        visited = new boolean[n + 1];
        check = new int[n + 1];

        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();

            graph.get(s).add(e);
            graph.get(e).add(s);
        }

        for(int i = 1; i <= n; i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        bfs(r);

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            sb.append(check[i]).append("\n");
        }

        System.out.println(sb.toString());

    }
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        check[start] = count++;
        q.offer(start);

        while(!q.isEmpty()){
            int node = q.poll();

            for(int next : graph.get(node)){
                if(!visited[next]){
                    visited[next] = true;
                    check[next] = count++;
                    q.offer(next);
                }
            }
        }
    }
}
