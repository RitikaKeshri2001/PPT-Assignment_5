public class Q1_1dInto2d_Array {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n == original.length) {
            int[][] arr = new int[m][n];
            int i = 0, j = 0;
            while (i < original.length && j < m) {
                int k = 0;
                while (k < n) {
                    arr[j][k] = original[i];
                    k++;
                    i++;
                }
                j++;
            }
            return arr;
        }
        return new int[0][0];
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int m=2, n=2;
        int arr[][] = construct2DArray(nums, m, n);
        for(int i=0;i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
