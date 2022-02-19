package a2oj50A;
import java.util.*;
public class Petya {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        s = s.replaceAll("[aeiouy]", "");

        StringBuilder builder= new StringBuilder(s);

        for(int i = 0;i< builder.length();i+=2){
            builder.insert(i, '.');
        }
        System.out.println(builder);
        sc.close();
    }
}
