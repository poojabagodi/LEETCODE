public class PascalSecond {
    //given nth row, print nth row of Pascal's triangle
    public  static void pascal(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        int n=5;
        pascal(n);
    }
}
