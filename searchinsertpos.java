class Solution {
    public int searchInsert(int[] nums, int target) {
        int l;
        l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>=target)
               return i;
         }
       return l; 
    }
}