class wave{

    public static void input(int[][] arr){
        int count =1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = count;
                count++;
            }
        }
    }

    public static void wave(int[][] arr){
        for(int j=0; j<arr[0].length; j++){
            if(j%2 == 0){
                for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int i=arr.length-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] arr = new int [4][4];
        input(arr);
        wave(arr);
    }
}