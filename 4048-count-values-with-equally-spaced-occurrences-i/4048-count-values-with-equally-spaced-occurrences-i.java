class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[]map=new int[101];
        int res=0;
        for(int i:nums){
            map[i]++;
        }
        for(int k=0;k<101;k++){
            if(map[k]==3){
                int[]arr=new int[3];
                int i=0;
                int j=0;
                while(j<nums.length && i<3){
                    if(nums[j]==k){arr[i]=j;i++;}
                    j++;
                }
                if(arr[1]-arr[0]==arr[2]-arr[1])res++;
            }
        }
        return res;
    }
}