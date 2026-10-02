class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer>map1=new HashSet<>();
        Set<Integer>map2=new HashSet<>();
        int[]res=new int[2];
        for(int i=0;i<nums1.length;i++){map1.add(nums1[i]);}
        for(int i=0;i<nums2.length;i++){map2.add(nums2[i]);}

        for(int i=0;i<nums1.length;i++){
            if(map2.contains(nums1[i]))res[0]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(map1.contains(nums2[i]))res[1]++;
        }

        
       return res; 
    }
}