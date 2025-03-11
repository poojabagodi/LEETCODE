
public class RepeatingAndMissingNumber {
    public static int misssing(int[] arr){
        int mis=0;
        int[] newarr=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;
        }
        for(int i=1;i<newarr.length;i++){
            if((newarr[i]==0)){
                mis=i;
                break;
            }
        }
        return mis;
        
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,4,1};
        System.out.println(misssing(arr));
     }

}


//THIS is using Arraylist
// import java.util.ArrayList;
// import java.util.List;

// public class Solution {
//     public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
//         int mis = 0, rep = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         int[] newarr = new int[A.size() + 1]; 

//         for (int i = 0; i < A.size(); i++) {
//             newarr[A.get(i)]++;  
//         }

//         for (int i = 1; i < newarr.length; i++) {
//             if (newarr[i] == 2) {
//                 rep = i;
//             }
//             if (newarr[i] == 0) {
//                 mis = i;
//             }
//         }

//         ans.add(rep);
//         ans.add(mis);
//         return ans;
//     }
// }
