class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count=0;
        Set<String>set=new HashSet<>();
        for(String s:words){
            StringBuilder res=new StringBuilder();
            for(char c:s.toCharArray()){
                res.append(arr[c-'a']);
            }
            String str=res.toString();
            if(!set.contains(str)){
                set.add(str);
                count++;
            }
        }
        return count;
    }
}