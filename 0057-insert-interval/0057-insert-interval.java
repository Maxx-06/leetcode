class Solution {
    public int[][] insert(int[][] v, int[] v2) {
        int n = v.length;
        int[][] arr = new int[n + 1][v2.length];
        int i = 0;
        int j = 0;
        while (i < n) {
            if (v[i][0] < v2[0]) {
                arr[j++] = v[i++];
            } else {
                arr[j++] = v2;
                break;
            }
        }

        while (i < n) {
            arr[j++] = v[i++];
        }

        if (j < arr.length) {
            arr[j] = v2;
        }

        int p = arr[0][0];
        int p2 = arr[0][1];

        List<int[]> result = new ArrayList<>();

        for (int k = 1; k < arr.length; k++) {
            int q = arr[k][0];
            int q2 = arr[k][1];

            if (p2 >= q) {
                p2 = Math.max(p2, q2);
            } else {
                result.add(new int[] { p, p2 });
                p = q;
                p2 = q2;
            }
        }

        result.add(new int[] { p, p2 });

        return result.toArray(new int[result.size()][]);
    }
}