public class RotateMatrix {
   //rotate matrix by 90
   //brute force tc-o(n^2) sc=o(n^2)
   public static int[][] rotate(int[][] mat){
    int n=mat.length;
    int m=mat[0].length;
    
    int newmat[][]=new int[n][m];
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            
            newmat[j][n-i-1]=mat[i][j];
           
        }
        
    }
    return newmat;
} 


//optimal tc=o(n^2) sc=o(1)





    public static void rotateoptimal(int[][] mat){
    int n=mat.length;
    
    for(int i=0;i<=n-2;i++){
        for(int j=i+1;j<=n-1;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
    }
   
    for(int i=0;i<n;i++){
        int a=0,b=n-1;
        for(int j=0;j<n/2;j++){
        int temp=mat[i][a];
        mat[i][a]=mat[i][b];
        mat[i][b]=temp;
        a++;
        b--;
        }
        
        
    }
        
    }
public static void main(String[] args) {
      int[][] matrix = {
        {5, 1, 9, 11},
          {2, 4, 8, 10},
          {13, 3, 6, 7},
          {15, 14, 12, 16}

      };
      
      rotateoptimal(matrix);

      // Print the matrix
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
  }
}


