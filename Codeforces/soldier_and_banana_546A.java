import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int rs=sc.nextInt();
        int amt=sc.nextInt();
        int n=sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++){
            temp+=rs*(i+1);
        }
        System.out.print(temp>amt?temp-amt:0);
    }
}