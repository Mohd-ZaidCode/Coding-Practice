class Solution {
    public String convertDateToBinary(String date) {
        String[]arr=date.split("-");
        String res=Integer.toBinaryString(Integer.parseInt(arr[0]))+"-"+Integer.toBinaryString(Integer.parseInt(arr[1]))
   +"-"+Integer.toBinaryString(Integer.parseInt(arr[2]));
        return res;
    }
}