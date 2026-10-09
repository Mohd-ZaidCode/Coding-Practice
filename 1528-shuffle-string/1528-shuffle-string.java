class Solution {
    public String restoreString(String s, int[] indices) {
        char[]ch=s.toCharArray();
        for(int i=0;i<indices.length;i++){
        for(int j=i+1;j<indices.length;j++){
            if(indices[i]>indices[j]){
                int temp=indices[i];
                indices[i]=indices[j];
                indices[j]=temp;
                char c=ch[i];
                ch[i]=ch[j];
                ch[j]=c;
            }
        }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            res.append(ch[i]);
        }
        return res.toString();
    }
}