class Solution {
    public boolean isTrionic(int[] nums) {
        int p=-1 ,q=-1, n = nums.length, i=1;
        while(i<n && nums[i] >nums[i-1]){
            i++;
        }
        p = i-1;
        if(p==0 || p==n-1) return false;

        while(i<n && nums[i] <nums[i-1]){
            i++;
        }
        q = i-1;
        if(q==n-1) return false;

        while(i<n){
            if(!(nums[i]> nums[i-1])) return false;
            i++;
        }
        return true;


    }
}