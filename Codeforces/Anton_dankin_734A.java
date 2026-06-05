import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int atone=0;
        int danik=0;
        for(char c:s.toCharArray()){
            if(c=='A')atone++;
            else danik++;
        }
        if(atone==danik)System.out.println("Friendship");
        else if(atone>danik)System.out.println("Anton");
        else System.out.println("Danik");
    }
}