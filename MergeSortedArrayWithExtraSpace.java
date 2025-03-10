


public class MergeSortedArrayWithExtraSpace {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online



    
    public static int[] sort(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int a=0,b=0,i=0;
        while(a<arr1.length && b<arr2.length){
            if(arr1[a]<arr2[b]){
                arr[i++]=arr1[a];
                a++;
            }
            else if(arr1[a]>arr2[b]){
                arr[i++]=arr2[b];
                b++;
            }
            else{
                arr[i++]=arr1[a];
                a++;
            }
        }
        
        while(a<arr1.length){
            arr[i++]=arr1[a++];
        }
        while(b<arr2.length){
            arr[i++]=arr2[b++];
        }
        return arr;
        
    }
    public static void main(String[] args) {
       int[] arr1={1,4,7};
       int[] arr2={2,5,8};
       int[] arr=sort(arr1,arr2);
       for(int i=0;i<arr.length;i++){
           System.out.print(" "+arr[i]);
       }
    }
}

