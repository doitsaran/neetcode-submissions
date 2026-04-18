class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnesCountItr = 0;
        int maxOnesCount = 0;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i] != 0)
            {
                maxOnesCountItr++;
            }
            else{
               
                if(maxOnesCountItr> maxOnesCount)
                {
                    maxOnesCount = maxOnesCountItr;
                }
                 maxOnesCountItr = 0;
            }
        }
        if(maxOnesCountItr> maxOnesCount)
                {
                    maxOnesCount = maxOnesCountItr;
                }
      return maxOnesCount;
        
    }
}