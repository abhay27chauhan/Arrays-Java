// rotate 90 degree clockwise

class rotate90dc{

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

    public static void rotate90dc(int[][] arr){
        transpose(arr);

        for(int i=0; i<arr.length; i++){
            int left = 0;
            int right = arr[i].length-1;

            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }display(arr);
    }

    public static void main(String[] args){
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate90dc(arr);
        System.out.println();
    }
}