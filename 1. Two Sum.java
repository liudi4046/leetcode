class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int i = 0;
        for(int num : nums){            
            if(map.get(target - num)!=null){
                int[] result = {i,map.get(target - num)};
                return result;
            }
            else{
                map.put(num,i);
            }
            i++;
        }
        return null;
    }
}
