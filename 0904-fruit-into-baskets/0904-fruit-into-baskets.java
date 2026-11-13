class Solution {
    public int totalFruit(int[] arr) {
        int low = 0;
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int res = -2;

        for(int high=0; high<n; high++){
            int x = arr[high];
            mp.put(x, mp.getOrDefault(x,0) + 1);
            
            while(mp.size() > 2){
                int y = arr[low];
                mp.put(y, mp.get(y) - 1);

                if(mp.get(y) == 0){
                    mp.remove(y);
                }
                low++;
            }

            if(mp.size() <= 2){
                res = Math.max(res, high-low + 1);
            }
        }

        return res;
    }
}