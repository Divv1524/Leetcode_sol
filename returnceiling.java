class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int n= letters.length;
        int last= n-1;
        int beg=0;
        while(beg<=last)
        {
            int mid= (beg+last)/2;
            if(letters[mid]>target)
            {
                last= mid-1;
                   
            }
            else{
                beg= mid+1; 
            }
                
        }
        return letters[beg % n];
    }
}