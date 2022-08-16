class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int premax=0,current=0;
        for(int num : nums){
            if(num==1){
                current++;
                if(premax < current)premax = current;
            }
            if(num==0){
                current=0;
            }
        }
        return premax;
    }
}
