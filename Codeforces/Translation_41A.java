import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        Boolean eq=true;
        if(s.length()!=t.length())System.out.println("NO");
        else{
          int j=s.length()-1;
          for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(j)){eq=false;System.out.println("NO");break;}
            j--;
          }
          if(eq)System.out.println("YES");
        }
    }
}