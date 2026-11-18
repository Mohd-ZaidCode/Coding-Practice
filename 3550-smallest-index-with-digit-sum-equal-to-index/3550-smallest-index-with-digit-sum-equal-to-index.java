class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==sumdig(nums[i]))return i;
        }
        return -1;
    }
    public int sumdig(int n){
            int temp=n,sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }n=sum;
        
        return sum;
    }
}