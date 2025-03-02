public class SetmatrixzeroOptimal {
public static int[][] setzero(int arr[][]){
    int col=1;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==0){
                arr[i][0]=0;
                if(j!=0){
                    arr[0][j]=0;
                }
                else{
                    col=0;
                }
               
                
            }
        }
    }


    for(int i=1;i<arr.length;i++){
        for(int j=1;j<arr[0].length;j++){

            if(arr[i][j]!=0){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
          
        }
    }

    if(arr[0][0]==0){
        for(int j=0;j<arr[0].length;j++){
            arr[0][j]=0;
        }
    }

    if(col==0){
        for(int i=0;i<arr.length;i++){
            arr[i][0]=0;
        }
    }
    return arr;
}

public static void main(String[] args) {
    int arr[][]={{1,2,0},{4,0,6},{7,8,9}};
    int res[][]=setzero(arr);
    for(int i=0;i<res.length;i++){
        for(int j=0;j<res[0].length;j++){
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
    }
  }


}
