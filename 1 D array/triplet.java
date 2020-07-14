// return true if sum of 3 values in an arr is equal to 0
import java.util.*;
class triplet{

    public static boolean triplet(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            if(doublet(arr, -arr[i], i+1)){
                return true;
            }
        }  return false;
    }

    public static boolean doublet(int [] arr, int data, int i){
        int j =arr.length-1;

        while(i<j){
            if(data == arr[i] +arr[j]){
                return true;
            }else if(data> arr[i] + arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int [] arr = {2,4,-1,3,-4,0,3};
        System.out.println(triplet(arr));
    }
}