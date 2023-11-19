import java.util.Arrays;

public class reductionarray {
  public static void main(String[] args) {
    int [] nums = {5,1,3};
    System.out.println(reductionOperations(nums));
  }
  public static int reductionOperations(int[] nums) 
  {
    Arrays.sort(nums);
        int n= nums.length;
        int prev=nums[0];
        int ans=0;
        for(int i=1;i<n;i++)
        {
            if(prev!=nums[i])
            {
                ans+= n-i;
                prev= nums[i];
            }
        }
        return ans;
    }
}

