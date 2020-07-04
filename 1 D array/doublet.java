class doublet{

    public static void doublet(int [] arr, int target){
        int left =0;
        int right = arr.length-1;

        while(left<right){
            if(target == arr[left] + arr[right]){
                System.out.println(arr[left] + " " + arr[right]);
                left++; right--;
            }else if(target > arr[left] + arr[right]){
                left++;
            }else{
                right--;
            }
        }
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,8,9,10};
        doublet(arr, 11);
    }
}