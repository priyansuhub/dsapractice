import java.util.*;

public class TestOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int m = 0; m< T; m++){
            int tc = 0;
            int tt = 1;
            
        while(tc++ < tt){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(Collections.nCopies(1, 1));
            k -= n;

            int curr = 2;
            for(int i = 2; i<= n;i++){
                if(k< arr.size()){
                    int val = arr.get(arr.size() - k - 1);
                    arr.add(val);
                    break;
                }
                k -= arr.size();
                arr.add(curr);
                curr++;
            }

            while(arr.size()< n){
                int lastelem = arr.get(arr.size() - 1);
                arr.add(lastelem);
            }

            for(int j: arr){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        }

        
        sc.close();
    }
}