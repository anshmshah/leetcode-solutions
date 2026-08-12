import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Duplicate found within distance k
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            // Remove element outside the window
            if (i >= k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}