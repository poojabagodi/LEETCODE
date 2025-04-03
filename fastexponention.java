public class fastexponention {
    
        public static  double myPow(double x, int n) {
            if(n==0){
                return 1;
            }
          long exp=n;
            if(n<0){
                x=1/x;
                exp= -exp;
            }
    
            double halfpower=myPow(x,(int)exp/2);
            double halfsq=(double)halfpower*halfpower;
            if(exp %2 != 0){
                halfsq=halfsq*x;
            }
    
            return halfsq;
        }

        public static void main(String[] args) {
            System.out.println(myPow(2, 5));
        }
    
}
