import java.util.*;
public class Q6_FindAllDuplicate {
    public static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] cs = new int[n+1];
        ArrayList<Integer> duplicate = new ArrayList<>();
        for(int i = 0; i < n; i++){
            cs[nums[i]] += 1;
        }
        for(int i = 0; i < cs.length; i++){
            if(cs[i] == 2){
                duplicate.add(i);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(nums);
        for(int i: ans) {
            System.out.print(i+" ");
        }
    }
}
