import java.util.*;
public class SubsequenceSumK {
    public static void main(String args[]){
        int arr[] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        int ind = 0;
        int n = 3;
        int sum = 4;
        int cc = 0;
        generateSubsequence(ind, list, arr, n, sum, cc);
    }
    public static void generateSubsequence(int ind, ArrayList<Integer>list, int arr[],int n, int sum, int cc){
        if(ind == n){
            if(cc == sum){
                System.out.println(Arrays.deepToString(list.toArray()));
            }
            
            return;
        }

            list.add(arr[ind]);
            cc+= arr[ind];
            generateSubsequence(ind+1, list, arr, n,sum, cc);
            list.remove(list.size()-1);
            cc-= arr[ind];
            generateSubsequence(ind+1, list, arr, n,sum,cc);
    }
}
