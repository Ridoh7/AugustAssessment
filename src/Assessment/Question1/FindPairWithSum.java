package Assessment.Question1;

import java.util.*;

public class FindPairWithSum {
    public static List<List<Integer>> findAllPairsWithSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {        int complement = target - num;
            if (seen.contains(complement)) {            result.add(Arrays.asList(num, complement));
            }        seen.add(num);
        }    if(result.isEmpty()){
            System.out.println("Not found");        return null;
        }
        return result;}
    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1, 5, 3};
        int target = 10;
        List<List<Integer>> pairs = findAllPairsWithSum(nums, target);

//        System.out.println(pairs);
//        System.out.println(99999);

        for (List<Integer> pair : pairs) {
            System.out.println("Pair found: (" + pair.get(0) + ", " + pair.get(1) + ")");
        }
    }
}
