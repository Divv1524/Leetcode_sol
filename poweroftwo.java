public class poweroftwo {
  public static void main(String[] args) {
    System.out.println(twopow(16));
  }
  public static boolean twopow(int n)
  {
      return n > 0 && (n & n - 1) == 0;
  }
}
