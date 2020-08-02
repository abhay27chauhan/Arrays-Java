class subarray{

    public static void subarray(char[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }System.out.println();
            }
        }
    }

    public static void main(String[] args){
        char[] arr = {'a','b','c','d'};
        subarray(arr);
    }
}