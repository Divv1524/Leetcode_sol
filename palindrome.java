class Solution {
    public boolean isPalindrome(int x) {
        int temp,r,sum=0;
        temp=x;
        while(temp>0)
        {
            r=temp%10;
            sum=(sum*10)+r;
            temp=temp/10;
        }
        return sum==x;
    }
}