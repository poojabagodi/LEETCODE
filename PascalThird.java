public class PascalThird {
        //given nth row, print first n rows of Pascal's triangle
        public  static void pascal(int n){
          
           
           for(int i=1;i<=n;i++){
            int ans=1;
            System.out.print(ans+" ");
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                System.out.print(ans+" ");
            }
             System.out.println();
           } 
            
        }
        public static void main(String[] args) {
            int n=6;
            
            pascal(n);
        }
    }
    

