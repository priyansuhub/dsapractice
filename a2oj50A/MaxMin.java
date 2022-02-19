package a2oj50A;
import java.util.*;
public class MaxMin {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[]  = new int[T];
        int size = T-1;
        //input
        for(int i = 0; i< T; i++){
            arr[i] = sc.nextInt();
        }
        //find the max from the start
        int maxpos;
        int minpos;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< T; i++){
            if(arr[i] > max){
                max = arr[i];
                maxpos = i;
            }
        }

        for(int i = size; i>=0;i++){
            if(arr[i] < min){
                min = arr[i];
                minpos = i;
            }
        }
        
        sc.close();
    }
}
