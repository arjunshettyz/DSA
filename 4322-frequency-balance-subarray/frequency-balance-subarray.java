class Solution {
    public int getLength(int[] nums) {
         int n = nums.length;

        int[] arr = nums;

        int ans = 1;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            Map<Integer, Integer> countFreq = new HashMap<>();

            int distinct = 0;
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                int x = nums[j];

                int oldFreq = freq.getOrDefault(x, 0);
                int newFreq = oldFreq + 1;
                freq.put(x, newFreq);

                if (oldFreq > 0) {
                    int c = countFreq.get(oldFreq);
                    if (c == 1) countFreq.remove(oldFreq);
                    else countFreq.put(oldFreq, c - 1);
                } else {
                    distinct++;
                }

                countFreq.put(newFreq, countFreq.getOrDefault(newFreq, 0) + 1);
                maxFreq = Math.max(maxFreq, newFreq);

                boolean valid = false;

                if (distinct == 1) {
                    valid = true;
                } else if ((maxFreq & 1) == 0) {
                    int half = maxFreq / 2;

                    int cntMax = countFreq.getOrDefault(maxFreq, 0);
                    int cntHalf = countFreq.getOrDefault(half, 0);

                    if (cntMax > 0 &&
                        cntHalf > 0 &&
                        cntMax + cntHalf == distinct) {
                        valid = true;
                    }
                }

                if (valid) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}