class Solution {
    public int lengthOfLastWord(String s) {
        int l,i,count=0;
        char c;
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            c=s.charAt(i);
            if (c == ' ' && count > 0) {
                break;
            }
            if(c!=' ')
            {
                count++;
            }         
        }
        return count;
    }
}