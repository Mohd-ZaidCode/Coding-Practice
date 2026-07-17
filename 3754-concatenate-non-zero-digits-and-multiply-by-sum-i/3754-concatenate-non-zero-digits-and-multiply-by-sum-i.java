class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long res=0;
        int p=0;
        while(n>0){
            if(n%10!=0)res=(n%10)*(int)Math.pow(10,p++)+res;
            sum+=n%10;
            n/=10;
        }
        return res*sum;
    }
}