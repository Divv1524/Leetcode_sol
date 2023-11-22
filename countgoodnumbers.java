public class countgoodnumbers 
{
  static long mod= 1000000007;
  public static void main(String[] args) {
    System.out.println(countGoodNumbers(4));
  }
  public static int countGoodNumbers(long n) {
      long even=n/2+n%2;
      long odd= n/2;
      long f=power(5,even)%mod;
      long l=power(4,odd)%mod;
      return (int)((f*l)%mod);
  }
  public static long power(long x, long y)
  {
      if(y==0)
        return 1;
      long ans=power(x,y/2);
      if(y%2==0)
        return (ans*ans)%mod;
      else
        return (x*ans*ans)%mod;  
  }
}
