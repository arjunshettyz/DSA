class Solution {
    public int minRemoval(int[] nums, int k) {
        int n =nums.length;
        int ans=n;
        int right = 0;
        Arrays.sort(nums);
        for(int left=0;left<n;left++){
            while(right < n && nums[right] <= (long) nums[left]*k ){
                right = right+1;
            }
            ans = Math.min(ans, n-(right-left));
        }
        return ans;
    }
}