import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                int value = nums1[i];
                result.add(value);
                
                while (i < nums1.length && nums1[i] == value) {
                    i++;
                }

                while (j < nums2.length && nums2[j] == value) {
                    j++;
                }
            }
        }

        int[] answer = new int[result.size()];

        for (int k=0; k<result.size(); k++) {
            answer[k] = result.get(k);
        }

        return answer;
    }
}