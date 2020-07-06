class iIntoArrOfI{

    public static int iIntoArrOfI(int[] arr){
         int sum = 0;
        int rot = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
            rot += i*arr[i];
        }

        int myMax = rot;
        
        for(int i=1; i<arr.length; i++){
            rot = rot-(sum- arr.length*arr[i-1]);
            
            if(myMax<rot){
                myMax = rot;
            }
        }
        return myMax;
    }

    public static void main(String [] args){
        int [] arr = {1,2,3};
        System.out.println(iIntoArrOfI(arr));
    }
}