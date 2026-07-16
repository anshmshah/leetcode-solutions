import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (num <= 0)
                neg.add(num);
            else
                pos.add(num);
        }

        for (int i = 0; i < neg.size(); i++) {
            neg.set(i, neg.get(i) * neg.get(i));
        }

        for (int i = 0; i < pos.size(); i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }

        Collections.reverse(neg);

        int i = 0, j = 0;

        while (i < neg.size() && j < pos.size()) {
            if (neg.get(i) <= pos.get(j)) {
                result.add(neg.get(i));
                i++;
            } else {
                result.add(pos.get(j));
                j++;
            }
        }

        while (i < neg.size()) {
            result.add(neg.get(i));
            i++;
        }

        while (j < pos.size()) {
            result.add(pos.get(j));
            j++;
        }

        int[] ans = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }
}