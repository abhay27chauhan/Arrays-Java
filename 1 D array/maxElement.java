import java.util.*;

class maxElement{

    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int [] arr = {2,4,13,45,67,8,23};

        System.out.println("maximum element is: " + maxElement(arr));
    }
}