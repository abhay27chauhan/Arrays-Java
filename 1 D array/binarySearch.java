import java.util.*;

class binarySearch{

    public static int binarySearch(int[] arr, int data){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){

            int mid  = (left + right)/2;
            if(arr[mid] == data){
                return mid;
            }else if(arr[mid]>data){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,6,8,9};
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 5));
    }
}