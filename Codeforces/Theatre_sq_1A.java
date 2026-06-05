import java.util.Scanner;
public class Theatre_sq_1A{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long m=sc.nextLong();
    long a=sc.nextLong();
    long l=m/a+(m%a==0?0:1);
    long b=n/a+(n%a==0?0:1);
    System.out.print(l*b);
}}