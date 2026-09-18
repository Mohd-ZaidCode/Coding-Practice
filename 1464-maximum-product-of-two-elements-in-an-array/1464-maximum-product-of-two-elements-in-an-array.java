class Solution {
    public int maxProduct(int[] nums) {
    int a=Math.min(nums[0],nums[1]);
    int b=Math.max(nums[0],nums[1]);
    for(int i=2;i<nums.length;i++){
        if(nums[i]>=b){a=b;b=nums[i];}
        else if(nums[i]>a)a=nums[i];
        
    }
        return (a-1)*(b-1);
    }
}