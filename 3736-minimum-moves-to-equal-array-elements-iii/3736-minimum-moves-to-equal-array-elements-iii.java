class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int temp=Integer.MIN_VALUE;
        for(int i:nums){temp=Math.max(temp,i);}
        for(int num:nums){
            res+=Math.abs(num-temp);
        }
    return res;
    }
}