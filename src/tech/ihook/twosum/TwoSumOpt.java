package tech.ihook.twosum;

import java.util.Arrays;

/**
 * Created by Jack on 16-9-10.
 * E-mail:zhongzhengdev@gmail.com
 */
public class TwoSumOpt {

    private static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            int k = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (k == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw  new IllegalArgumentException("No two number solution");
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, -5};
        int[] ints = twoSum(nums, -8);
        System.out.println(Arrays.toString(ints));
    }

}
