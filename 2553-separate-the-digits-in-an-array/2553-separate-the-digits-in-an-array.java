class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        for(int num:nums){
            String temp=num+"";
            for(int i=0;i<temp.length();i++){
                ls.add(temp.charAt(i)-'0');
            }
        }
       int[] res = ls.stream().mapToInt(i -> i).toArray();
        return res;
    }
}