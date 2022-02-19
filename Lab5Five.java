import java.util.Scanner;

public class Lab5Five {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i = 0; i< 3; i++){
            for(int j = 0; j< 3; i++){
                arr[i][j] = sc.nextInt();
            }
        }  
        int sumld = 0;
        int subrd = 0;

        for(int i = 0; i< 3; i++){
            for(int j = 0; j<3; j++){
                if(i == j){
                    System.out.println(arr[i][j]);
                    sumld+=arr[i][j];
                }
                if(i+j == 2){
                    System.out.println(arr[i][j]);
                    subrd+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of right diagonal="+sumld);
        System.out.println("Sum of left diagonal="+ subrd);

        sc.close();

    }
}
