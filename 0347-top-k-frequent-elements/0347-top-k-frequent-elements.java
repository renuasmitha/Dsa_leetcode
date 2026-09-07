class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] sol = new int[k];

        // Count frequency
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        // Find k most frequent
        for (int i = 0; i < k; i++) {

            int max = 0;
            int maxKey = 0;

            for (int key : freq.keySet()) {
                if (freq.get(key) > max) {
                    max = freq.get(key);
                    maxKey = key;
                }
            }

            sol[i] = maxKey;
            freq.remove(maxKey);
        }

        return sol;
    }
}