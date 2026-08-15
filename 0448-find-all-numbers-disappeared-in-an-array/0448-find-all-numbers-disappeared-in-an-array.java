class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr)  {
        List<Integer> nums= new ArrayList<>();
         int i=0;
    while(i< arr.length){
        int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                Solution p=new Solution();
                p.swap(arr,i,correct);
            }
            else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1) nums.add(j+1);
        }
    return nums;}
    public void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
   
}

