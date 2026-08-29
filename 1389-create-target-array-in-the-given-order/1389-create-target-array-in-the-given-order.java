class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ls.add(index[i],nums[i]);
        }
        int[] res = ls.stream().mapToInt(i -> i).toArray();
        return res;
    }
}