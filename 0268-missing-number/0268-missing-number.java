class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i< arr.length){
            if(arr[i]!=i && arr[i]< arr.length){
               Solution p=new Solution();
                p.swap(arr,i,arr[i]);
            }
            else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j) return j;
        }
    return i;}
    public void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}