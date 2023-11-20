public class powerofthree {
  public static void main(String[] args) {
    System.out.println(threepow(27));
  }
  public static boolean threepow(int n)
  {
    if(n == 1) return true;
    if(n%3 != 0 || n <= 0) return false;
    return threepow(n/3);
  }
}
