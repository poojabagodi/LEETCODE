public class twosumusingarray {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
    return ans;
    }

    public static void main(String[] args) {
        twosumusingarray obj=new twosumusingarray();
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=obj.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
