package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 两数之和
 * @author: xiangjie.xiao
 * @create: 2022-01-29 16:10
 **/
public class TwoSum {

    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        // TO TEST
        System.out.println(solution.twoSum(new int[]{1, 3, 5, 8}, 6));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> targetMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {

                if (targetMap.containsKey(nums[i])) {
                    return new int[]{targetMap.get(nums[i]),i};
                }
                targetMap.put(target - nums[i], i);
            }


            return null;

        }
    }
}
