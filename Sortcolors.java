// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 
class SortColors {
    
    public  static void sortColor(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;

            }
            else{
              int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
               high--;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={1,0,2,1,0,0,1,2,0,0};
         sortColor(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
         }
    }
}