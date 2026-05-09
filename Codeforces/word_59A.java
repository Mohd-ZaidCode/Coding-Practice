import java.util.Scanner;
public class word_{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int count=0;
        for(char c:a.toCharArray()){
          if(c-'a'<0)count++;
        }
        if(count>a.length()/2)System.out.print(a.toUpperCase());
        else System.out.print(a.toLowerCase());
    }
}