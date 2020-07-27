import java.util.Scanner;
class shellRotate{

    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    public static void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] arr, int r){
        reverse(arr, arr.length-r, arr.length-1);
        reverse(arr, 0, arr.length-r-1);
        reverse(arr, 0, arr.length-1);
    }

    public static int[] fillOnedFromShell(int[][] arr, int s){
        int minr = s-1, minc = s-1, maxc = arr[0].length-s, maxr = arr.length-s;
        int sz = 2*(maxr-minr + maxc-minc);
        int [] oned = new int[sz];
        int idx=0;
        for(int i=minr, j=minc; i<=maxr; i++){
            oned[idx] = arr[i][j];
            idx++;
        }
        for(int j=minc+1, i=maxr; j<=maxc; j++){
            oned[idx] = arr[i][j];
            idx++;
        }
        for(int i=maxr-1, j=maxc; i>=minr; i--){
            oned[idx] = arr[i][j];
            idx++;
        }
        for(int j=maxc-1, i=minr; j>minc; j--){
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;
    }

    public static void fillShellFromOned(int[][] arr, int s, int [] oned){
        int minr = s-1, minc = s-1, maxc = arr[0].length-s, maxr = arr.length-s;
        int idx=0;
        for(int i=minr, j=minc; i<=maxr; i++){
            arr[i][j] = oned[idx];
            idx++;
        }
        for(int j=minc+1, i=maxr; j<=maxc; j++){
           arr[i][j] = oned[idx];
            idx++;
        }
        for(int i=maxr-1, j=maxc; i<=minr; i--){
            arr[i][j] = oned[idx];
            idx++;
        }
        for(int j=maxc-1, i=minr; j<minc; j--){
            arr[i][j] = oned[idx];
            idx++;
        }

    }

    public static void shellRotate(int[][] arr, int s, int r){
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int [][] arr = {{11,12,13,14,15,16},
                        {17,18,19,20,21,22},
                        {23,24,25,26,27,28},
                        {29,30,31,32,33,34},
                        {35,36,37,38,39,40},
                        {41,42,43,44,45,46}
                    };
        
        shellRotate(arr, 2, 3); // shellRotate(2-d-array, shell no. )
        display(arr);
    }
}