class spiralTraversal{

    public static void spiralTraversal(int[][] arr, int rows, int cols){
        int minr=0, minc=0,maxr=arr.length-1, maxc = arr[0].length-1;
        int tne = rows*cols;
        int cnt =0;
        while(cnt<tne){
            //left wall
            for(int i=minr; i<=maxr && cnt<tne; i++){
                System.out.print(arr[i][minc] + " ");
                cnt++;
            }
            minc++;

            //bottom wall
            for(int j=minc; j<=maxc && cnt<tne; j++){
                System.out.print(arr[maxr][j] + " ");
                cnt++;
            }
            maxr--;

            //right wall
            for(int i=maxr; i>=minr && cnt<tne; i--){
                System.out.print(arr[i][maxc] + " ");
                cnt++;
            }
            maxc--;

            //top wall
            for(int j=maxc; j>=minc && cnt<tne; j--){
                System.out.print(arr[minr][j] + " ");
                cnt++;
            }
            minr++;
        }
    }

    public static void main(String[] args){
        int[][] arr = { {11,12,13,14,15,16,17},
                        {21,22,23,24,25,26,27},
                        {31,32,33,34,35,36,37},
                        {41,42,43,44,45,46,47},
                        {51,52,53,54,55,56,57}
                    };
        
        spiralTraversal(arr, 5, 7);
        System.out.println();
    }
}