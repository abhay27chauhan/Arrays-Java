class exitPoint{

    public static void exitPoint(int[][] arr){
        int i=0, j=0, dir =0;
        while(true){
            dir += arr[i][j];
            dir %= 4;
            if(dir == 0){
                j++;
            }else if(dir==1){
                i++;
            }else if(dir ==2){
                j--;
            }else{
                i--;
            }
            if(i<0 ||i==arr.length || j==arr[0].length || j<0){
                break;
            }
        }
        if(j == arr[0].length){
            j--;
        }
        if(i == arr.length){
            i--;
        }
        if(i < 0){
            i++;
        }
        if(j<0){
            j++;
        }
        System.out.println(i + " " + j);
    }

    public static void main(String[] args){
        int[][] arr = {{0,0,1,0}, {1,1,0,0}, {0,0,0,0}, {1,0,1,0}};
        exitPoint(arr);
    }
}