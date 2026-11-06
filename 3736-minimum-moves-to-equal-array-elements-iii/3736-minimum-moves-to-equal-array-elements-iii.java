class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int temp=Integer.MIN_VALUE;
        for(int num:nums){
            temp=Math.max(num,temp);
            res+=num;
        }
    return temp*nums.length-res;
    }
}