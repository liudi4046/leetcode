class Solution {
    public boolean isAnagram(String s, String t) {
        int [] times = new int[26];
        for(char ch : s.toCharArray()){
            times[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            --times[ch - 'a'];         
        }
        for(int time :times){
            if(time!=0){
                return false;
            }
        }
        return true;
    }
}
