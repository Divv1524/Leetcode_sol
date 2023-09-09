class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length,s=-1;
        for(int i=0;i<n;++i){
            if(nums[i]!=val){
            nums[++s] = nums[i];
        }
        }
        return s+1;
    }
}