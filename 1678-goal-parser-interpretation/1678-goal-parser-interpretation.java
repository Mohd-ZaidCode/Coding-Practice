class Solution {
    public String interpret(String command) {
        String res="";
        boolean open=false;
        for(char c: command.toCharArray()){
            if(c=='(')open=true;
            else if(c==')'){
                if(open)res+='o';
                }
            else{
                open=false;
                res+=c;
            }
        }
        return res;
        }
    
}