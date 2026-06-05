import java.util.*;
public class stringTask118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String res="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y'){
                continue;
            }
            res+="."+c;
        }
        
        System.out.println(res);
    }
}