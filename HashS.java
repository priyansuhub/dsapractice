import java.util.*;
public class HashS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
       
        for(int i = 0; i< T;i++){
            int n = sc.nextInt();
            HashSet<Integer> x1 = new HashSet<>();
            HashSet<Integer> y1 = new HashSet<>();
            for(int j = 0 ; j< n; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                x1.add(x);
                y1.add(y);
            }
            System.out.println(x1.size() + y1.size());
        }
        sc.close();
    }
}
