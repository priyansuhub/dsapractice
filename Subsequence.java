
import java.util.*;
public class Subsequence {
    public static void main(String args[]){
        int arr[] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        int ind = 0;
        int n = 3;
        generateSubsequence(ind, list, arr, n);
    }

    public static void generateSubsequence(int ind, ArrayList<Integer>list, int arr[],int n){
        if(ind == n){
            System.out.println(Arrays.deepToString(list.toArray()));
            return;
        }
        list.add(arr[ind]);
        generateSubsequence(ind+1, list, arr, n);
        list.remove(list.size()-1);
        generateSubsequence(ind+1, list, arr, n);
    }
}
