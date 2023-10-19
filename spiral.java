import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
       int m=matrix.length;
          List<Integer>res=new ArrayList<>();
          if(m==0)
          return res;
        int n=matrix[0].length;
        int i, sr = 0, sc = 0;
        int er= matrix.length-1;
        int ec=matrix[0].length-1;
        while (sr <=er && sc <=ec) {
            //top
			for (int j = sc; j <=ec; j++) {
				res.add(matrix[sr][j]);
			}
			//right
			for (i = sr+1; i <= er; i++) {
				res.add(matrix[i][ec]);
			}
            //bottom
            for (int j = ec-1; j>= sc; j--) {
                if(sr==er)
                {
                    break;
                }
					res.add(matrix[er][j]);
            }
            //left    
			for (i = er - 1; i >= sr+1; i--) {
                if(sc==ec)
                {
                    break;
                }
					res.add(matrix[i][sc]);
            }
            sc++;
            sr++;
            er--;
            ec--;
			}
            return res;
		}
}