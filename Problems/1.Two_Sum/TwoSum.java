class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], index);
        }
        for (int index = 0; index < nums.length; index++) {
            int temp = target - nums[index];
            if (map.containsKey(temp) && map.get(temp) != index) {
                res[0] = index;
                res[1] = map.get(temp);
                break;
            }
        }
        return res;
    }
}