class Solution {
    public int kthFactor(int n, int k) {

        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {

                smaller.add(i);

                if (i != n/i) {
                    larger.add(n / i);
                }

            }

        }

        Collections.reverse(larger);
        smaller.addAll(larger);

        if (smaller.size() < k)
            return -1;

        return smaller.get(k - 1);
    }
}