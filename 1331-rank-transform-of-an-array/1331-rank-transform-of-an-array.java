class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        int[] dest = arr.clone();
        Arrays.sort(dest);
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(dest[i])){
                map.put(dest[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}