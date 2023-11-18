public class powerton1 {

  //for just simple numbers and also for simple negative numbers
  public static void main(String[] args) {
      System.out.println(myPow(2,5));
  }
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
