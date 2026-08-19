class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        int n=A.length;
        int[]res=new int[n];
        for(int i=0;i<n;i++){
            if(i>0)res[i]=res[i-1];
            if(s1.contains(B[i]))res[i]++;
            if(s2.contains(A[i]))res[i]++;
            if(A[i]==B[i])res[i]++;
            s1.add(A[i]);
            s2.add(B[i]);
        }
        return res;

    }
}