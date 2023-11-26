public class numberofsteps {
  static int count=0;
  public static void main(String[] args) {
    System.out.println(numberOfSteps(14));
  }
  public static int numberOfSteps(int num) {
    // Base case: num becomes 0
    if (num == 0) {
        return count;
    }

    // If num is even, divide by 2
    if (num % 2 == 0) {
        count++;
        return numberOfSteps(num / 2);
    }
    // If num is odd, subtract 1
    else {
        count++;
        return numberOfSteps(num - 1);
    }
    }
}