import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
    
        for (int i = 0; i < nums.length; i++) 
        {
            map.put(nums[i],i);
        }
         for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                int index= map.get(t);
                if(index==i)
                continue;
                return new int[] {i,index};
            }
         }

         return new int[]{};
    }
}
