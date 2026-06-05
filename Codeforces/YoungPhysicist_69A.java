import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      long n=sc.nextLong();
      long odd=(n/2+n%2)*(n/2+n%2);
      long even=n/2*(n/2+1);
      long ans=even-odd;
      System.out.println(ans);
    }
}