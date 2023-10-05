public class searchinmountain {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,2,1};
        System.out.println(findInMountainArray(3,arr));
    }
    public static int findInMountainArray(int target, int[] mountainArr) 
    {
        int peak= findPeakElement(mountainArr);
        int first= bsearch(mountainArr,target, 0,peak);
        if(first!=-1)
        {
            return first;
        }
        else
        {    
        return bsearch(mountainArr,target, peak+1,mountainArr.length-1);
        }
    }
    
    public static int findPeakElement(int[] nums) 
    {
        int beg = 0;
        int end = nums.length - 1;
    
        while (beg < end)
            {
                int mid = beg + (end - beg) / 2;
                if (nums[mid] > nums[mid+1])
                {
                    end = mid;
                } 
                else
                {
                    beg = mid + 1; 
                }
            
            }
                return beg;
        }
        static int bsearch(int[] arr,int ele,int beg,int last)
        {
           
            boolean isasc= arr[beg]< arr[last];
            
            while(beg<=last)
            {
                int mid= (beg+last)/2;
                if(arr[mid]==ele)
                {
                    return mid;
                }
                if(isasc)
                {
                    if(arr[mid]>ele)
                {
                    last= mid-1;
                   
                }
                else{
                    beg= mid+1;
                }
                }
                else
                {
                    if(arr[mid]<ele)
                {
                    last= mid-1;
                   
                }
                else{
                    beg= mid+1;
                }
                     
                }
                
            }
            return -1;
        }
    }

