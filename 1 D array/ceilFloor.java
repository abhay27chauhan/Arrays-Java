class ceilFloor{

    public static void display(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void ceilFloor(int[] arr, int data){
        int left =0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == data){
                int [] ans = new int[2];
                ans[0] = mid;
                ans[1] =mid;
                display(ans);
                return;
            }else if(arr[mid]>data){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(right == -1){
            int [] ans = new int[2];
            ans[0] = -1;
            ans[1] = left;
            display(ans);
        }else if(left == arr.length){
            int [] ans = new int[2];
            ans[0] = right;
            ans[1] = arr.length;
            display(ans);
        }else if (left>right && left != arr.length && right != -1){
            int [] ans = new int[2];
            ans[0] = right;
            ans[1] = left;
            display(ans);
        }
    }

    public static void main(String[] args){
        int [] arr = {3,5,18,20,25,30,38};

        ceilFloor(arr,17);
    }
}