class Solution {
    public int[] sumZero(int n) {
        int [] arr=new int[n];
        int j=n-1;
            for (int i = 0; i <n/2; i++) {
                arr[i] = i + 1;
                arr[j] = -i-1;
                j--;
        }
        return arr;
    }
}