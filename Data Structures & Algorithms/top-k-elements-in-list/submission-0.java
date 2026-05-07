class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        List<int[]> mostFreq = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
        }

        numFreq.forEach((key, value) -> { mostFreq.add(new int[] {value, key}); });
        mostFreq.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = mostFreq.get(i)[1];
        }
        return res;
    }
}
