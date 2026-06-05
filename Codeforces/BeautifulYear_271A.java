import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n++;
        while(!check(n)){
          n++;
        }
        System.out.println(n);
    }
    public static boolean check(int n){
      Set<Integer> set=new HashSet<>();
      while(n>0){
        set.add(n%10);
        n/=10;
      }
      
      if(set.size()==4)return true;
      return false;
    }
}