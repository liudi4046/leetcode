class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] keyTemplate = new char[26];
            for(char ch : str.toCharArray()){
                keyTemplate[ch - 'a']++;
            }
            String key = new String(keyTemplate);
            map.computeIfAbsent(key,k-> new ArrayList<>());
            map.get(key).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        result.addAll(map.values());
        return result;
    }
}
