public class Q3_SortedSquare {
    public static int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1;
        int n = nums.length-1;
        int[] arr = new int[n+1];
        while(left <= right) {
            int l = nums[left]*nums[left];
            int r = nums[right]*nums[right];
            if(l >= r) {
                arr[n] = l;
                left++;
            } else {
                arr[n] = r;
                right--;
            }
            n--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] sq = sortedSquares(nums);
        for(int i=0; i<sq.length; i++) {
            System.out.print(sq[i] + " ");
        }
        System.out.println();
    }
}
