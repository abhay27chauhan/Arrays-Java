class kadanesAlgo{

    public static void kadane(int [] arr){
        int cs=0, ce=0, os=0, oe=0, omax=0, cmax=0;

        while(ce<arr.length){
            if(cmax>0){
                cmax += arr[ce];
            }else{
                cs =ce;
                cmax = arr[ce];
            }
            if(omax<cmax){
                os = cs;
                oe = ce;
                omax = cmax;
            }
            ce++;
        }
        for(int i=os; i<=oe; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();

        System.out.println("Sum: " + omax);
    }

    public static void main(String[] args){
        int [] arr = {3,5,-1,-7,8,4,2,-6,10};
        kadane(arr);
    }
}