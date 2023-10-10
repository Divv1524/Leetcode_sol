class Solution {
    public int search(int[] nums, int target) {
        int len= nums.length;
        int b=0;
        int l=len-1;
        int mid;
        while(b<=l)
        {
            mid=(b+l)/2;
            if(target==nums[mid])
            {
              return mid;
              else if(target>nums[mid])
              b=mid+1;

                
            else
              l=mid-1;
        }
        return -1;
    }
}
