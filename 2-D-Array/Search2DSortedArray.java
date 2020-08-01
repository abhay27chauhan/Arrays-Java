class Search2DSortedArray{

    public static void Search2DSortedArray(int[][] arr, int x){
        int i=0;
        int j= arr[0].length-1;

        while(i != arr.length && j>=0){
            if(arr[i][j] == x){
                System.out.println(i + " " + j);
                return; 
            }else if(arr[i][j]< x){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("Invalid Input!");
        return;
    }

    public static void main(String[] args){
        int[][] arr = {{11,12,13,14},
                       {21,22,23,24},
                       {31,32,33,34},
                       {41,42,43,44}
                    };
        Search2DSortedArray(arr,42);
    }
}