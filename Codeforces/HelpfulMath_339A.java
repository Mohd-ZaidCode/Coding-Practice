import java.util.*;
class HelpfulMath_339A{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int index=0;
        int count[]=new int[3];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count[0]++;
            if(s.charAt(i)=='2')count[1]++;
            if(s.charAt(i)=='3')count[2]++;
            if(s.charAt(i)!='+')index++;
        }
        String ans ="";
        int i=0;
        int pointer=0;
       while(pointer<3){
           for(int j=0;j<count[pointer];j++){
               ans+=pointer+1;
               ans+="+";
           } 
           i++;
           pointer++;
       }
       System.out.println(ans.substring(0,ans.length()-1));
    }
}
