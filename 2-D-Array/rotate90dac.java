// rotate 90 degree Anti-clockwise

class rotate90dac{

    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    public static void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void rotate90dac(int[][] arr){
        transpose(arr);

        for(int i=0; i<arr.length/2; i++){
            for(int j=0; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length-1-i][j];
                arr[arr.length-1-i][j] = temp;
            }
        }display(arr);
    }

    public static void main(String[] args){
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate90dac(arr);
        System.out.println();
    }
}