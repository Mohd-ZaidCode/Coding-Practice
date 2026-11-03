class Solution {
    public int minMergedInteger(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            res=Math.min(res,Integer.parseInt(nums[i]+""+nums[i+1]));
        }
        return res;
    }
}