package Lab5;

public class One {
    public static void main(String []args){
        int n = sub(10, 20);
        float m = sub(10.0f,20.0f);
        int o = sub(20);
        System.out.println(n);
        System.out.println(m);
        System.out.println(o);
    }
    public static int sub(int a, int b){
        int res = a-b;
        return res;
    }
    public static float sub(float a, float b){
        float res = a -b;
        return res;
    }
    public static int sub(int b){
        int a =10;
        int res = a -b;
        return res;
    }
}
