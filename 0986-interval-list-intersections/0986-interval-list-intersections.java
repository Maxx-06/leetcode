class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        ArrayList<int[]> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            // Check whether intersection exists
            if (start <= end) {
                result.add(new int[]{start, end});
            }


            //my solution  (p,q) and (r,s)
            // r <=q and   p =>s

            // int p = firstList[i][0];
            // int q = firstList[i][1];

            // int r = secondList[j][0];
            // int s = secondList[j][1];

            // if( r<= q && p <= s){
            //     result.add(new int[]{Math.max(p,r) , Math.min(q,s) });
            // }

            // Move the interval that ends first
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}