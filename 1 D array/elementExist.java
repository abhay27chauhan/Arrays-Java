import java.util.*;

class elementExist{

    public static boolean elementExist(int[] arr, int data){
        for(int i=0; i<arr.length; i++){
            if(data == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int [] arr = {2,4,15,6,7,8,1,0};
        System.out.println(elementExist(arr, 8));
    }
}