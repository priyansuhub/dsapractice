import java.util.*;
public class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int mu = 0; mu< T;mu++){
          int n = sc.nextInt();
          String alice = sc.next();
          String bob = sc.next();
          int temp = n*2;
          char ans[] = new char[temp];
          for(int j = 0; j< temp; j++){
            ans[j] = '0';
          }
          int ab = 0;
          int ae = n-1;
          int bb = n-1;
          int be = 0;
          int l = 0;
          int r = temp-1;
          for(int j = 0 ; j< temp;j++){
              if(bb< be){
                  ans[l] = alice.charAt(ae);
                  ae+=1;
                  l+=1;
                  continue;
              }
              if(ab > ae){
                  ans[l] = bob.charAt(bb);
                  bb -=1;
                  l+=1;
                  continue;
              }
              if(j%2 ==1){
                  if(!(bob.charAt(bb)> alice.charAt(ab))){
                      ans[r] = bob.charAt(be);
                      r-=1;
                      be+=1;
                  }else{
                      ans[l] = bob.charAt(bb);
                      l+=1;
                      bb -=1;
                  }
              }else{
                if(!(alice.charAt(ab)< bob.charAt(bb))){
                    ans[r] = alice.charAt(ae);
                    r-=1;
                    ae-=1;
                }else{
                    ans[l] = alice.charAt(ab);
                    ab+=1;
                    l +=1;
                }

              }
          }
          String res = "";
          for(int pri = 0; pri<ans.length;pri++){
              res+=ans[pri];
          }
          System.out.println(res);
        }
        sc.close();
    }
}
