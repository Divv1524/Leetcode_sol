public class poweroffour {
  public static void main(String[] args) {
    System.out.println(fourpow(16));
  }
  public static boolean fourpow(int n) {
    if(n==0)
    {
        return false;
    }
    else if(n==1)
    {
        return true;
    }
    else if(n%4 !=0 ||n<=0)
    {
        return false;
    }
    return fourpow(n/4);
}
}
