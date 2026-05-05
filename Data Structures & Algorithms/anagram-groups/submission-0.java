class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i< strs.length;i++){
               char[] chrs = strs[i].toCharArray();
               Arrays.sort(chrs);
               String str = new String(chrs);
               map.putIfAbsent(str, new ArrayList<String>());
               map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());

    }
}
