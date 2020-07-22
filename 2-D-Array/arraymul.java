import java.util.Scanner;

class arraymul{

    public static void input(int[][] arr){
        int count =0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = count;
                count++;
            }
        }
    }

    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }

    }

    public static void multiplication(int[][] arr1, int[][] arr2){
        int[][] ans = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                for(int k=0; k<arr1.length; k++){
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        } display(ans);
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("No. of rows: ");
        int r = scn.nextInt();
        System.out.print("No. of columns: ");
        int c = scn.nextInt();
        int [][] arr1 = new int [r][c];
        int [][] arr2 = new int [r][c];
        input(arr1);
        input(arr2);
        multiplication(arr1, arr2);
    }
}