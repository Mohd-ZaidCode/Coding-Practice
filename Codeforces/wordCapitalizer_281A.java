import java.util.*;
public class wordCapitalizer_281A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        System.out.println(sb.toString());
    }
}