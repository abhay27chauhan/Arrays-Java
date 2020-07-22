class subset{

    public static void subset(int [] arr){
        int pow =1; 
        for(int i=0; i<arr.length; i++){
            pow = pow*2;
        }
        int count =0;
        while(count<pow){
            int length=0, cc=count;
            while(cc != 0){
                int rem = cc%2;
                cc /= 2;
                if(rem ==1){
                    System.out.print(arr[length] + "");
                }
                length++;
            }
            System.out.println();
            count++;
        }
    }

    public static void main(String[] args){

        int [] arr = {1,2,3};
        subset(arr);
    }
}