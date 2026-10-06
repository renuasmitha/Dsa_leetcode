class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        int longest=0;
        int count=1;
        for(int j:hash){
            int current=j;
            if(!hash.contains(j-1)){
                current=j;
                count=1;
            
            while(hash.contains(current+1)){
                current++;
                count++;
                
            }
            longest=Math.max(longest,count);
            }


        }
        return longest;
    }
    
}