class Maxsumsubarray {
    public static  int maxSubArray(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        boolean allnegative=true;
        for(int i=0;i<nums.length;i++){
           ms=Math.max(ms,nums[i]);
           if(nums[i]>=0){
            allnegative=false;
           }
        }

        if(allnegative){
            return ms;
        }
        ms=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        

        }
        return ms;
    }

    public static void main(String[] args){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}