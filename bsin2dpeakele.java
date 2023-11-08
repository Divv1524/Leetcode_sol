import java.util.*;
public class bsin2dpeakele {
    public static void main(String[] args) {
        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }

    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = maxele(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < m ? mat[row][mid + 1] : -1;
            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int maxele(int[][] mat, int n, int m, int col) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}
