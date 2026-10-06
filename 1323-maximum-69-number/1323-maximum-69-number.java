class Solution {
    public int maximum69Number (int num) {
        String s=""+num;
        boolean b=false;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && !b){
                res.append('9');
                b=true;
            }else res.append(s.charAt(i));
        }
        return Integer.parseInt(res.toString());
    }
}