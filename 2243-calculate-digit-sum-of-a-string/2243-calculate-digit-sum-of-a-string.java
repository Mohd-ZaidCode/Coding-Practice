class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k)return s;
        String res="";
        int count=0;
        int i=0;
        int temp=0;
        while(i<s.length()){
            count++;
            temp+=s.charAt(i)-'0';
            i++;
            if(count==k){
                res+=temp;
                temp=count=0;
            }
        }
        if(s.length()%k!=0)res+=temp;
        return digitSum(res,k);
    }
}