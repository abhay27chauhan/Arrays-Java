class subsetOfArray{

    public static void subsetOfArray(int[] arr){
        int limit = (int)Math.pow(2, arr.length);

        for(int i=0; i<limit; i++){
            String set = "";
            int temp = i;
            for(int j=arr.length-1; j>=0; j--){
                int rem = temp%2;
                temp /= 2;

                if(rem==0){
                    set = "-\t" + set; 
                }else{
                    set = arr[j] +"\t" + set;
                }
            }
            System.out.println(set);
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        subsetOfArray(arr);
    }
}