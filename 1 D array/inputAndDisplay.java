import java.util.*;

class inputAndDisplay{
    static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr){
        System.out.print("Input: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int [] arr){
        System.out.print("Display: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args){
        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        int [] arr = new int [size];
        input(arr);
        display(arr);

    }
}