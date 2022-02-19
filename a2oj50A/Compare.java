package a2oj50A;
import java.util.*;
public class Compare {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        
        String b = sc.nextLine().toLowerCase();
        int res = a.compareTo(b);
        if(res == 0){
            System.out.println(0);
        }else if(res > 0){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
        
        sc.close();
    }
}
