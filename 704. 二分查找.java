class Solution {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        while(target!=nums[(left+right)/2]){
            if(target<nums[(left+right)/2]){
                right = (left+right)/2-1;
            }
            else {
                left = (left+right)/2+1;
            }
            if(left>right)return -1;
        }
        return (right+left)/2;
    }
}
