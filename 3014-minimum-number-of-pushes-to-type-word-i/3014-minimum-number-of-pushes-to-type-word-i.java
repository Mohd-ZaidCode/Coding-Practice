class Solution {
    public int minimumPushes(String word) {
       int len=word.length();
       if(len<8)return len;
       int x=len/8;
       int res=(len%8)*(x+1);
       for(int i=1;i<=x;i++){
        res+=i*8;
       }
       return res;
    }
}