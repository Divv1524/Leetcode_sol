public class missingnum {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum= (n*(n+1))/2;
        int s2=0;
        
        for(int i=0;i<n;i++)
        {
            s2=s2+nums[i];
        }
        return (sum-s2);

    }
    public static void main(String[] args) {
        int nums[]= {0,1,2,3,5};
        System.out.println(missingNumber(nums));
    }
} 
    

