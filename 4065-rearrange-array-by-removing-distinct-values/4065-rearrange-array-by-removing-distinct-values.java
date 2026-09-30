class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp=new int[101];
        int[]res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        int i=0;
        while(i<nums.length){
            for(int j=1;j<temp.length;j++){
                if(temp[j]>0){
                    res[i++]=j;
                    temp[j]=temp[j]-1;
                }
            }
        }
        return res;

    }
}