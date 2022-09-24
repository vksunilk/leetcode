class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0) {
            return res;
        }
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] hash = new char[26];
            for(char c:str.toCharArray()) {
                hash[c-'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key,k->new ArrayList<>());
            map.get(key).add(str);
        }
        res.addAll(map.values());
        return res;
        
    }
}