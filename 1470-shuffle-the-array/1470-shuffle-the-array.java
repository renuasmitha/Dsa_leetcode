class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle=new int[2*n];
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        
        for(int i=0;i<n;i++){
            arr1[i]=nums[i];  
        }
        int i=n;
        for(int j=0;j<n;j++){
            arr2[j]=nums[i];
            i++;
        }
        int k=0,l=0;
        for(int j=0;j<2*n;j++)
        {
            if(j%2==0){
                shuffle[j]=arr1[k];
                k++;
            }
            else{
                shuffle[j]=arr2[l];
                l++;
            }
        }

        return shuffle;
    }
}