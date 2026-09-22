class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res=new int[2];
        int[] freq=new int[grid.length*grid.length];
        for(int[] arr:grid){
            for(int num:arr){
                freq[num-1]++;
                if(freq[num-1]==2)res[0]=num;
                
            }
        }
        for(int i=0;i<freq.length;i++)if(freq[i]==0)res[1]=i+1;

        return res;
    }
}