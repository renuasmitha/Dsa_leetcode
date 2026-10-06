class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] freq=new int[k];
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int  i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);

        }
        for(int j=0;j<k;j++){
            int max=0;
            int maxindex=0;
            for(int l:hash.keySet()){
                if(hash.get(l)>max){
                    max=hash.get(l);
                    maxindex=l;
                }
               
            }
             freq[j]=maxindex;
            hash.remove(maxindex);
        }


    return freq;
    }
}