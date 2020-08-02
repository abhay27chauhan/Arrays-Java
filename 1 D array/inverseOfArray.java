// inter-change value in array with its position

class inverseOfArray{

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static int[] inverseOfArray(int[] arr){
        int[] inv= new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int v = arr[i];
            inv[v] = i;
        }
        return inv;
    }

    public static void main(String[] args){
        int[] arr = {3,4,1,2,0};
        int[] inv = inverseOfArray(arr);
        display(inv);
    }
}