class Solution {
    public int mySqrt(int x) {
        if(x==1)return 1;
        if(x==0)return 0;
        int left=0,right=x/2+1,mid=0;
        while(left<=right){
            mid = left+(right - left)/2;
            
            if(x/mid == mid)return mid;
            else if (x/mid > mid){
                left = mid +1;
            }
            else{
                right = mid - 1;
            }
            
        }
        
        return right;
    }
}
