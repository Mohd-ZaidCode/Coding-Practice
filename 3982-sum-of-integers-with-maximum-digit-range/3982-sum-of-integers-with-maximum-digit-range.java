class Solution {
    public int maxDigitRange(int[] nums) {
        int res=0;
        int range=Integer.MIN_VALUE;
        for(int i:nums){
        int small=Integer.MAX_VALUE;
        int highest=Integer.MIN_VALUE;
            int temp=i;
            while(temp>0){
                small=Math.min(temp%10,small);
                highest=Math.max(temp%10,highest);
                temp/=10;
            }
            if(range==highest-small)res+=i;
            else if(range<highest-small){
                range=highest-small;
                res=i;
            }
        }
        return res;
    }
}