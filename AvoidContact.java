import java.util.*;
public class AvoidContact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int j = 0; j< T;j++){
           long x=sc.nextLong();
           long a=sc.nextLong();
           long b=sc.nextLong();
            
          print(x,a,b);

        }
        sc.close();
    }

    public static void print(long x, long a, long b){
        if(x%a==0)
        {
            long p=x/a;
            long d=b*p;
            long sum=0;
            for(int i=1;i<= Math.sqrt(d);i++)
            {
                if(sum>x)
                break;
                if(d%i==0)
                {
                    sum=sum+i;
                    if(d/i!=i)
                    sum=sum+d/i;
                }
            }
            if(sum!=x)
            {
                System.out.println("-1");
            }
            else
            System.out.println(d);
        }
        else
        System.out.println("-1");
    }
}
