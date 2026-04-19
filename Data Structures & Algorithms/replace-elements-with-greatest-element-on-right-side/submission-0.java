class Solution {
    public int[] replaceElements(int[] arr) {
        int arrLength = arr.length;
        int[] newResult = new int[arrLength];
        int maxResult = -1;
        for(int i = arrLength - 1; i >= 0; i--)
        {
            newResult[i] = maxResult;
            maxResult = Math.max(maxResult,arr[i] );
        }
        return newResult;
        
    }
}