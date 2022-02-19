import java.util.*;
class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for(int i = 0; i< T;i++){
    long x = sc.nextLong();
    long m = sc.nextLong();
    long temp = 2;
    long cnt = 0;
    while(temp<=0){
        temp<<=1;
        cnt++;
    }
    temp/=2;
    long one = cnt + 1;
    if(one > m){
        System.out.println(0);
        break;
    }
    if(temp == x){
        System.out.println(1+(m-one));
    }else{
        System.out.println(m-one);
        }
    }
    sc.close();
  }
}