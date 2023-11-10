public class majorityelement {
  public static void main(String[] args) {
    int [] arr = {2,2,1,1,1,2,2};
    System.out.println(printele(arr));
  }
  public static int printele(int arr[])
  {
    int ele=0;
    int count=0;
    int n= arr.length;
    for(int i=0;i<n;i++)
    {
      if(count==0)
      {
        count=1;
        ele=arr[i];
      }
      else if(arr[i]==ele)
      {
        count++;
      }
      else {
        count--;
      }
    }
    int count1=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]==ele)
      {
        count1++;
      }
      if(count1> (n/2))
      {
        return ele;
      }
    }
    return -1;
  }
}
