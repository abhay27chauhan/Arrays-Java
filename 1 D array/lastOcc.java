class lastOcc{

    public static int lastOcc(int[] arr, int data){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left + right )/2;

            if(arr[mid] == data){
                if(mid+1<arr.length && arr[mid+1] == data){
                    left = mid+1;
                }else{
                    return mid;
                }
            }else if(arr[mid]>data){
                right = mid -1;
            }else{
                left = mid+1;
            }
        } return -1;
    }

    public static void main(String[] args){
        int [] arr = {1,1,1,4,4,4,5,5,5,5,6,6,6,6};
        System.out.println(lastOcc(arr, 5));
    }
}