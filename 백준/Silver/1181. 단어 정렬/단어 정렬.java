

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(sc.next());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length() != s2.length()){
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(String word : list){
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}
