class Solution {
    public int missingNumber(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int value_index = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[value_index]) {

                int temp = nums[i];
                nums[i] = nums[value_index];
                nums[value_index] = temp;

            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {

            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }
}
