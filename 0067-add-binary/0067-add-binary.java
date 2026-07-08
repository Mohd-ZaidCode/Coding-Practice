class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int temp=0;
        String ans="";
        while(i>=0 || j>=0||temp==1){
            if(i>=0)temp+=a.charAt(i--)-'0';
            if(j>=0)temp+=b.charAt(j--)-'0';
            ans=temp%2+ans;
            temp/=2;
        }
        
        return ans;
   
    }
}