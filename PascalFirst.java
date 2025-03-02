public class PascalFirst {
    //given r,c, return the value of the cell in the pascal triangle(r,c)
  public static int pascal(int r, int c) {
    r=r-1;
    c=c-1;
    int res=1;
    for(int i=0;i<c;i++){
        res=res*(r-i);
        res=res/(i+1);
    
    }   
    return res;
}

   public static void main(String[] args) {
    System.out.println(pascal(5,3));

   }
}