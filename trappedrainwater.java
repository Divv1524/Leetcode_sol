import java.util.*;
public class trappedrainwater {
    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));
    }
    public static int trappedwater(int height[])
    {
        //leftmax
        int n= height.length;
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]= Math.max(height[i], leftmax[i-1]);

        }
        //rightmax
        int rightmax[]= new int[n];
        rightmax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]= Math.max(height[i], rightmax[i+1]);

        }
        //loop
        int trapped=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel= Math.min(leftmax[i],rightmax[i]);
            trapped+= waterlevel- height[i];
        }
        return trapped;

    }
}
