package Lab5;

import java.util.Scanner;

public class Two {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        Rectangle obj = new Rectangle();
        obj.area(length, width);
        obj.perim(length, width);
        sc.close();
    }
}

class Rectangle{
    //create 
    
    public void area(int l, int w){
       System.out.println(l * w);
    }
    public void perim(int l, int w ){
        System.out.println("Jo bhi hai perimeter wala karlo yaar");
    }

}

