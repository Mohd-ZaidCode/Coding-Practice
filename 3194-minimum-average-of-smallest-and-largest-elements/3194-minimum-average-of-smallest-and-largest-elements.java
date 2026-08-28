class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double avrg=Integer.MAX_VALUE;
        while(i<j){
            double temp=(nums[i]+nums[j])/(double)2;
            avrg=Math.min(avrg,temp);
            i++;j--;

        }
        return avrg;
    }
}