class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++){
            for(int j=i+1;j<score.length;j++){
            if(score[j][k]>score[i][k]){
                for(int l=0;l<score[0].length;l++){
                    int temp=score[i][l];
                    score[i][l]=score[j][l];
                    score[j][l]=temp;
                }
            }
        }
        }
        return score;
    }
}