public class SearchInSortedMatrix {
    //2d matrix
    public static boolean search(int[][] mat,int key){
        int n=0,m=mat[0].length-1;
        
        while(n<mat.length && m>=0){
            if(key==mat[n][m]){
                return true;
            }
            else if(key<mat[n][m]){
                m--;
            }
            else{
                n++;
            }
        }
        return false;
        
    }   

    public static void main(String[] args) {
        int[][] matrix = {
            {5, 1, 9, 11},
              {2, 4, 8, 10},
              {13, 3, 6, 7},
              {15, 14, 12, 16}
    
          };

          System.out.println(search(matrix, 312));
    }
}
