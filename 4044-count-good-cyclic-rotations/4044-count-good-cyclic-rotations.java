class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length/2;
        long sum1=0;
        long sum2=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
            sum2+=nums[i+n];
        }
        for(int i=0;i<n;i++){
            if(sum1!=sum2)count++;
            System.out.println(sum1+" "+sum2+(sum1!=sum2));
            sum1+=nums[i+n];
            sum1-=nums[i];
            sum2+=nums[i];
            sum2-=nums[i+n];
        }
        return count;
        
    }
}