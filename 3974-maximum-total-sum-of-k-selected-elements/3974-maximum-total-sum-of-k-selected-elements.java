class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum=0;
        for(int i =nums.length-1;i>=0;i--){
            if(k==0)break;
            k--;
            long temp=nums[i];
            if(mul>0)sum+=temp*mul;
            else sum+=temp;
            mul--;
        }
        return sum;
    }
}