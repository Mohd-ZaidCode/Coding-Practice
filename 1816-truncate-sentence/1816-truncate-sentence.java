class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        StringBuilder res=new StringBuilder();
        int i=0;
        while(k-->0){
            res.append(arr[i]+" ");
            i++;
            }
        return res.toString().trim();
    }
}