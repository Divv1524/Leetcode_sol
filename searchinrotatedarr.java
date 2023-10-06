public class searchinrotatedarr {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
        public static int search(int[] nums, int target) {
            int pivot= findPivot(nums);
            if(pivot== -1)
            {
                return bsearch(nums,target,0,nums.length-1);
            }
            if(nums[pivot]== target)
            {
                return pivot;
            }
            else if(target>=nums[0])
            {
                return  bsearch(nums,target,0,pivot-1);
            }
            return bsearch(nums,target,pivot+1,nums.length-1);
        }
    
         public static int bsearch(int arr[],int ele,int beg,int last)
        {
            while(beg<=last)
            {
                int mid= (beg+last)/2;
                if(arr[mid]==ele)
                {
                    return mid;
                }
                else if(arr[mid]>ele)
                {
                    last= mid-1;
                   
                }
                else{
                    beg= mid+1; 
                }
                
            }
            return -1;
        }
        static int findPivot(int[] arr)
        {
            int beg=0;
            int last = arr.length-1;
            while(beg<=last)
            {
                int mid= beg+ (last - beg)/2;
                //4 cases
                if(mid<last && arr[mid] > arr[mid+1])
                {
                    return mid;
                }
                if(mid>beg && arr[mid] < arr[mid-1])
                {
                    return mid-1;
                }
                if(arr[mid] <= arr[beg])
                {
                    last=mid-1;
                }
                else{
                    beg= mid+1;
                }
    
            }
            return -1;
        }
    }

