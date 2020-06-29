import java.util.*;

class minElement{

    public static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        return min;
    }

    public static void main(String[] args){
        int [] arr = {2,4,13,45,67,8,23};

        System.out.println("minimum element is: " + minElement(arr));
    }
}