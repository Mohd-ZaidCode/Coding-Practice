class Solution {
    public long maxPairStrength(int[] nums) {
        long res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long g=gcd(nums[i],nums[j]);
                long temp=((long)nums[i]*nums[j])/(g*g);
                res=Math.max(res,temp);
            }
        }
        return res;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}