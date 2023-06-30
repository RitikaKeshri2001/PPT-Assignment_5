import java.util.*;

public class Q4_FindDifferenceArray {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // add all elements of nums1 in set1
        for(int i: nums1) {
            set1.add(i);
        }
        // check whether the elements of nums2 is present in set1 or not
        for(int n: nums2) {
            if(!set1.contains(n)) {
                set2.add(n); // if not present add in set2
            }
        }
        // we remove element in set1 which are present in nums2 array
        for(int n: nums2) {
            set1.remove(n);
        }
        return List.of(new ArrayList<>(set1), new ArrayList<>(set2));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> result = findDifference(nums1, nums2);
        for(List<Integer> i: result) {
            for(int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
