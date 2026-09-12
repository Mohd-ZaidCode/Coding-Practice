class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer ,Integer>map=new HashMap<>();
        int res=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)==3){
                int[]arr=new int[3];
                int i=0;
                int j=0;
                while(j<nums.length && i<3){
                    if(nums[j]==n){arr[i]=j;i++;}
                    j++;
                }
                if(arr[1]-arr[0]==arr[2]-arr[1])res++;
            }
        }
        return res;
    }
}