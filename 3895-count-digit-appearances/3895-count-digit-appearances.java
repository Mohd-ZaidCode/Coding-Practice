class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res=0;
        for(int n:nums){
            res+=dig(n,digit);
        }
        return res;
    }
    public int dig(int n,int d){
        int res=0;
        while(n>0){
            if(n%10==d)res++;
            n/=10;
        }
        return res;
    }
}