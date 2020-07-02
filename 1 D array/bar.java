class bar{

    public static int max(int[] arr){
        int maxValue = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        } return maxValue;
    }

    public static void pattern(int [] arr){
        int cmax = max(arr);
        int max = cmax;
        for(int i=0; i<max; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]>= cmax){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            } cmax--;
            System.out.println();
        }
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        pattern(arr);
    }
}