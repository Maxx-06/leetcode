class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int p = nums[0][0];
        int p2 = nums[0][1];

        for(int i = 1; i < nums.length; i++) {
            int n = nums[i][0];
            int n2 = nums[i][1];

            if(p2 >= n) {
                p2 = Math.max(p2,n2);
            }
            else {
                result.add(new int[]{p,p2});
                p = n;
                p2 = n2;
            }
        }

        result.add(new int[]{p,p2});

        return result.toArray(new int[result.size()][]);
    }
}