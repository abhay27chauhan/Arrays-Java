class saddlePoint{

    public static void saddlePoint(int[][] arr){

        
        for(int i=0; i<arr.length; i++){
            int svj = 0;
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][j]<arr[i][svj]){
                    svj = j;
                }
            }
            boolean flag = true;
            for(int k=0; k<arr.length; k++){
                if(arr[k][svj]>arr[i][svj]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i][svj]);
                return;
            }
        }

    }

    public static void main(String[] args){
        int[][] arr = {{11,12,13,14},
                       {15,16,17,18},
                       {19,20,21,22},
                       {23,24,25,26}
                    };
            
        saddlePoint(arr);
    }
}