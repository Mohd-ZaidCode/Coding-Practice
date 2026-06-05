import java.util.*;
public class Solution{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);;
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
     long n=sc.nextLong();
     long a=sc.nextLong();
     long b=sc.nextLong();
     if(b>3*a){
      System.out.println(a*n);
     }
     else{
      if(n%3==0){
       System.out.println((n/3)*b);
      }
      else{
       System.out.println((n/3)*b+Math.min((n%3)*a,b));
      }
     }
    }
  }
}