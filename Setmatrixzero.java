class Setmatrixzero{

    public static int[][] setrow(int arr[][],int row){
       for(int j=0;j<arr[0].length;j++){
           arr[row][j]=-1;
       }
       return arr;
    }

    public static int[][] setcol(int arr[][],int col){
        for(int i=0;i<arr.length;i++){
            arr[i][col]=-1;
        }
        return arr;
     }

   public static int[][] setzero(int arr[][]){
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
             if(arr[i][j]==0){
                setrow(arr,i);
                setcol(arr,j);
              }
          }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
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
