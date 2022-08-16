class Solution {
    public int maximumProduct(int[] nums) {
        
        int a = 3,temp = 0;
        while(a!=0){
            for(int i = 0;i < nums.length - 1 ; i++){
                if(nums[i]>nums[i+1]){
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
            for(int i = nums.length-1;i>0;i--){
                if(nums[i]<nums[i-1]){
                    temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                }
            }
            a--;
        }
        int left = nums[0]*nums[1]*nums[nums.length-1];
        int right = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return left > right ? left : right;
        
    }
}
