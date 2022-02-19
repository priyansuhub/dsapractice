package a2oj50A;
import java.util.*;
public class FirstSet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char []chars = n.toCharArray();
        Set<Character> firstSet = new LinkedHashSet<>();
        for(char ch: chars){
            firstSet.add(ch);
        }
        String st = "";
        for (char ch: firstSet){
            st = st+ ch;
        }
        System.out.println(st);
        if(st.contains("hello")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
