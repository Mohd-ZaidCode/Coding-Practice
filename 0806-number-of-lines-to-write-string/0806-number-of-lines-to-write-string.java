class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int []res={1,0};
        for(char c:s.toCharArray()){
            if(res[1]+(widths[c-'a'])>100){
                res[1]=widths[c-'a'];
                res[0]++;

            }
            else res[1]+=widths[c-'a'];
        }return res;

    }
}