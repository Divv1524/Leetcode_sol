public class findmininRSA {
        public static  int findMin(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
            int ans = Integer.MAX_VALUE;
            while (low <= high) {
                int mid = (low + high) / 2;
    
                //if left part is sorted:
                if (nums[low] <= nums[mid]) {
                    // keep the minimum:
                    ans = Math.min(ans, nums[low]);
    
                    // Eliminate left half:
                    low = mid + 1;
    
                } else { //if right part is sorted:
    
                    // keep the minimum:
                    ans = Math.min(ans, nums[mid]);
    
                    // Eliminate right half:
                    high = mid - 1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
            int ans = findMin(nums);
            System.out.println("The minimum element is: " + ans );
        }
    }

