public class SetmatrixzeroBetter {
    public static int[][] setzero(int arr[][]){
        int row[]=new int[arr.length];
        int col[]=new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i]==1 || col[j]==1){
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
