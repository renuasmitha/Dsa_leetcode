class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,i=0;
        int[] coun=new int[1000000];
        for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                count++;
            }
            else{      
                    coun[i]=count;
                    count=0;
                    i++;
            }


        }
        coun[i]=count;
        int max=coun[0];
     for(int k=0;k<coun.length;k++){
        if(max<coun[k]){
            max=coun[k];

        }
    }
    return max;


}
}