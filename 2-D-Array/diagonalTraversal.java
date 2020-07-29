class diagonalTraversal{

    public static void diagonalTraversal(int[][] arr){
        for(int g=0; g<arr.length; g++){
            for(int i=0,j=g; j<arr.length; j++,i++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    public static void main(String[] args){
        int [][] arr = {{11,12,13,14,15,16},
                        {17,18,19,20,21,22},
                        {23,24,25,26,27,28},
                        {29,30,31,32,33,34},
                        {35,36,37,38,39,40},
                        {41,42,43,44,45,46}
                    };
        diagonalTraversal(arr);

    }
}