import java.util.*;
public class pascalstriangle1 {
  //variation 3 of pascals triangle
  // basic approach of pascalstriangle
  public static void main(String[] args) {
    int numRows = 5;
    System.out.println(pascalTriangle(numRows));
  }
  public static List<Integer> generaterow(int row) {
    long ans=1;
    List<Integer> ansrow = new ArrayList<>();
    ansrow.add(1);
    for(int col=1;col<row;col++)
    {
      ans= ans*(row-col);
      ans= ans/col;
      ansrow.add((int)ans);
    }
    return ansrow;
    }
    public static List<List<Integer>> pascalTriangle(int N) {
      List<List<Integer>> ans = new ArrayList<>();
      for(int i=1;i<=N;i++)
      {
        List<Integer> temp = generaterow(i);
        ans.add(temp);
      }
      return ans;

}
}
