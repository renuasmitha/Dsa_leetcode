class Solution {
    public int[] resultArray(int[] nums) {
        int  n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        
        
        int j=1,k=1;
        for(int i=2;i<n;i++)
        {
            if(arr1[j-1]>arr2[k-1])
            {
                arr1[j]=nums[i];
                j++;
            }
            else
            {
                arr2[k]=nums[i];
                k++;
            }
        }
        int[] result=new int[n];
        int r;
        for(r=0;r<j;r++)
        {
            result[r]=arr1[r];
        }
        
        for(int a=0;a<k;a++)
        {
            result[r]=arr2[a];
            r++;
            
        }
        return result;


    }
}