import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<String> In = new HashSet<>();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String state = sc.next();

            if(state.equals("enter")){
                In.add(name);
            }else{
                In.remove(name);
            }
        }

        ArrayList<String> list = new ArrayList<>(In);
        Collections.sort(list, Collections.reverseOrder());

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}