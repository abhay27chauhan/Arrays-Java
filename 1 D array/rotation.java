import java.util.*;

class rotation{

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }System.out.println();
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] arr, int left, int right){
        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void rotation(int[] arr, int r){
        int n = arr.length;
        reverse(arr, n-r, n-1);
        reverse(arr, 0, n-r-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.print("Number of rotations: ");
        int r = scn.nextInt();
        System.out.println("Before rotation: ");
        display(arr);
        rotation(arr,r);
        System.out.println("After rotation: ");
        display(arr);


    }
}