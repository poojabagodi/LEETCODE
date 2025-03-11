import java.util.*;
public class DuplicateInArray {
    
    public static  int findDuplicate(int[] nums) {
        int dup=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                dup=nums[i];
                break;
            }
        }
        return dup;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6,8,2,1};
        System.out.println(findDuplicate(arr));
    }
}

