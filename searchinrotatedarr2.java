public class searchinrotatedarr2 {
    public static void main(String[] args) {
        int[] arr ={7,8,9,1,2,3,4,5,6};
        int target=1;
        int n= arr.length;
        System.out.println(search(arr,target,n));
    }
    public static int search(int[]arr,int target,int n)
    {
        int beg=0;
        int last= n-1;

        while(beg<=last)
        {
            int mid=(beg+last)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>=arr[beg])
            {
                if(arr[beg]<=target && arr[mid]>=target)
                {
                    last= mid-1;
                }
                else{
                    beg= mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[last])
                {
                    beg= mid+1;
                }
                else{
                    last= mid-1;
                }
            }
        }
        return -1;
    }
}
