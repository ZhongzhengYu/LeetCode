package tech.ihook.twosum;

import java.util.Arrays;

/**
 * Created by Jack on 16-9-9.
 * E-mail:zhongzhengdev@gmail.com
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
class TwoSum {

    public static void main(String[] args) {
        int[] nums = {-3, 4, 3, 90};
        int[] ints = twoSum(nums, 0);
        System.out.println(Arrays.toString(ints));

    }

    private static int[] twoSum(int[] nums, int target) {
        int[] store = new int[2];
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            if (num > 0) {
                if (num <= target) {
                    common(target, num, i, nums, store);
                }
            } else {
                if (num >= target) {
                    common(target, num, i, nums, store);
                } else {
                    common(target, num, i, nums, store);
                }
            }

        }
        return store;
    }

    private static void common(int target, int num, int i, int[] nums, int[] store) {
        int j = target - num;
        for (int k = i + 1; k < nums.length; k++) {
            if (j == nums[k]) {
                if (i > k) {
                    store[0] = k;
                    store[1] = i;
                } else {
                    store[0] = i;
                    store[1] = k;
                }
            }
        }
    }
}
