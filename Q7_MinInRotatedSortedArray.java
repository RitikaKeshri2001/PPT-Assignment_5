public class Q7_MinInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right) {
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println("Minimum element of the array is: "+findMin(nums));
    }
}
