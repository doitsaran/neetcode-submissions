class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> arrList = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i] != val)
           {
            arrList.add(nums[i]);
           }

        }
       
        int result[] = arrList.stream().mapToInt(Integer::intValue).toArray();

        System.arraycopy(result, 0, nums, 0, result.length);
        return result.length;
    }
}