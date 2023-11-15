public class nextpermutation {
  public static void main(String[] args) {
    int[] A = {2, 1, 5, 4, 3, 0, 0};
    nextPermutation(A);

    System.out.print("The next permutation is: [");
    for (int it : A) {
        System.out.print(it + " ");
    }
    System.out.println("]");
}
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        {
            rev(nums,0,n-1);
            return;
        }
         for(int i=n-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
                swap(nums,i,ind);
                break;
            }
        }
        rev(nums,ind+1,n-1);
    }
    private static void rev(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
