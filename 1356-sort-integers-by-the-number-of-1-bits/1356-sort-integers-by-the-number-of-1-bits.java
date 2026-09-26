class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int []temp=new int[arr.length];
        for(int i=0;i<arr.length;i++)temp[i]=Integer.bitCount(arr[i]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(temp[i]<temp[j]){
                    int b=temp[i];
                    temp[i]=temp[j];
                    temp[j]=b;
                    b=arr[i];
                    arr[i]=arr[j];
                    arr[j]=b;

                }
                else if(temp[i]==temp[j] && arr[i]<arr[j]){
                    int b=arr[i];
                    arr[i]=arr[j];
                    arr[j]=b;
                }
            }
        }
        System.out.println(Arrays.toString(temp));
        return arr;
    }
}