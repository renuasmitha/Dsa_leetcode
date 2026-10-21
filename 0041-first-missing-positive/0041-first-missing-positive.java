class Solution {
    public int firstMissingPositive(int[] nums) {

        //[3,4,-1,1]
        //[-1,4,3,1]
        //[-1,1,3,4]
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i] ){
                int crtindex=nums[i]-1;

                int temp=nums[crtindex];
                nums[crtindex]=nums[i];
                nums[i]=temp;

            }
        }

        //[1,-1,3,4]
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        
        return n+1;
    }
}