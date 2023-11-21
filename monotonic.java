public class monotonic {
  public static boolean isMonotonic(int[] nums) {
    int n= nums.length;
    boolean inc= true;
    boolean dec= true;
    for(int i=0;i<n-1;i++)
    {
        
        if(nums[i]<nums[i+1])
        {
            inc= false;
        }
        else if(nums[i]>nums[i+1])
        {
            dec=false;
        }
    }
    return inc||dec;
}
public static void main(String[] args) {
  int arr[]={1,3,2};
  System.out.println(isMonotonic(arr));
}
}
