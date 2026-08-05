class Solution {
    String s="a";
    public char kthCharacter(int k) {
        int len=s.length();
        if(len>k)return s.charAt(k-1);
        for(int i=0;i<len;i++){
            s+=(char)(s.charAt(i)+1);
        }
        System.out.println(s);
        return kthCharacter(k);
    }
     
}