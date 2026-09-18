class Solution {
    public int maxProduct(int[] nums) {
    int a=-1;
    int b=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>=b){a=b;b=nums[i];}
        else if(nums[i]>a)a=nums[i];
        
    }
        return (a-1)*(b-1);
    }
}