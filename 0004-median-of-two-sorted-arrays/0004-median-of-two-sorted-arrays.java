class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []arr=new int[nums1.length+nums2.length];
        double result;
        int i1=0;
        int i2=0;
        int index=0;
        while(i1<nums1.length && i2<nums2.length){
            if(nums1[i1]<nums2[i2]){
                arr[index]=nums1[i1];
                index++;i1++;
            }
            else{
                arr[index]=nums2[i2];
                index++;i2++;
            }
        }
        while(i1<nums1.length && index<=arr.length){
             arr[index]=nums1[i1];
                index++;i1++;
        }
        while(i2<nums2.length && index<=arr.length){
             arr[index]=nums2[i2];
                index++;i2++;
        }
    if(arr.length%2==0){
        result=(arr[arr.length/2]+arr[(arr.length/2)-1]);
        result=result/2;
    }
    else result=arr[arr.length/2];
    
    
    return result;
    }
}