import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class powerset2 {
  public static void main(String[] args) {
    int nums[]= {1,2,2};
    System.out.println(subsetsWithDup(nums));
  }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        findSubsets(nums,list,new ArrayList<>(),0);
        
        return removeDuplicateSubsets(list);
    }
    
    public static void findSubsets(int[] nums,List<List<Integer>> list,ArrayList<Integer> temp,int i)
    {
        if(i>=nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        
        findSubsets(nums,list,temp,i+1);
        temp.add(nums[i]);
        findSubsets(nums,list,temp,i+1);
        temp.remove(temp.size()-1);
    }
    public static List<List<Integer>> removeDuplicateSubsets(List<List<Integer>> originalList) {
        List<List<Integer>> uniqueSubsets = new ArrayList<>();
        HashSet<List<Integer>> seenSubsets = new HashSet<>();

        for (List<Integer> subset : originalList) {
            // Sort the subset to make it comparable
            subset.sort(null);

            // Check if the subset has been seen before
            if (seenSubsets.add(subset)) {
                uniqueSubsets.add(subset);
            }
        }

        return uniqueSubsets;
    }
}