class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        for(int i=0; i<nums.length - 1; i++) {

            int minIndex = i;

            for(int j= i+1; j<nums.length; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }
}