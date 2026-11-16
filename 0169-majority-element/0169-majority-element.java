class Solution {
    public int majorityElement(int[] nums) {
        //boyer moares voting algorithm
        int majority = nums[0];
        int votes=1;
        for(int i=1;i<nums.length;i++){
            if(majority==nums[i]){
                votes++;
            }
            else{
                votes--;
                if(votes==0){
                    majority=nums[i];
                    votes=1;

                }
            }

               
            }
            return majority;
        }
}


