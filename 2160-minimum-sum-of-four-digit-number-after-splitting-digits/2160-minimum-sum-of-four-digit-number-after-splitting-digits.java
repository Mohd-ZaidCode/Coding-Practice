class Solution {
    public int minimumSum(int num) {
        int []arr=new int[4];
        int i=0;
        while(i<4){
            arr[i++]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int res= arr[3]+arr[2]+ 10*(arr[0]+arr[1]);
        return res;
    }
}