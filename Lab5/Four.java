package Lab5;

import java.util.Scanner;

public class Four {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");

        int arr[] = new int[]{1,2,3,4,1,1,2,3,4,4,4,2,2,1};
        int fr[] = new int[arr.length];
        int visited = -1;
       
        for(int i = 0; i< arr.length; i++){
            int count = 1;
            for(int j = 0;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i]!= visited){
                fr[i] = count;
            }
        }
        for(int i = 0; i< fr.length;i++){
            System.out.println(fr[i]);
        }
        
        sc.close();
    }
}
