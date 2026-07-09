class Solution {
    public int minElement(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int i:nums){
            res=Math.min(res,sumd(i));
            // i=sumd(i);
        }
        return res;
    }
    public int sumd(int a){
        int res=0;
        while(a>0){
            res+=a%10;
            a/=10;
        }
        return res;
    }
}