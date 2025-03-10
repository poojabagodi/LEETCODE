
import java.util.*;
public class MergeSortedArrayWithoutextraspace {
    
// Online Java Compiler
// Use this editor to write, compile and run your Java code online



    
    public static void  sort(int[] arr1,int[] arr2){
        int a=arr1.length-1,b=0;
        while(a>=0 && b<arr2.length){
            if(arr1[a]>arr2[b]){
                 int temp=arr1[a];
                arr1[a]=arr2[b];
                arr2[b]=temp;
                a--;
                b++;
            }   
           else{
               break;
           }
                 
                
            }
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        }
        
    
    public static void main(String[] args) {
       int[] arr1={1,4,5};
       int[] arr2={2,5,8};
        sort(arr1,arr2);
       for(int i=0;i<arr1.length;i++){
           System.out.print(" "+arr1[i]);
       }
       System.out.println();
        for(int i=0;i<arr2.length;i++){
           System.out.print(" "+arr2[i]);
       }
    }
}
