// class Solution {
//     public int[][] insert(int[][] v, int[] v2) {
//         int n = v.length;
//         int[][] arr = new int[n + 1][v2.length];
//         int i = 0;
//         int j = 0;
//         while (i < n) {
//             if (v[i][0] < v2[0]) {
//                 arr[j++] = v[i++];
//             } else {
//                 arr[j++] = v2;
//                 break;
//             }
//         }

//         while (i < n) {
//             arr[j++] = v[i++];
//         }

//         if (j < arr.length) {
//             arr[j] = v2;
//         }

//         int p = arr[0][0];
//         int p2 = arr[0][1];

//         List<int[]> result = new ArrayList<>();

//         for (int k = 1; k < arr.length; k++) {
//             int q = arr[k][0];
//             int q2 = arr[k][1];

//             if (p2 >= q) {
//                 p2 = Math.max(p2, q2);
//             } else {
//                 result.add(new int[] { p, p2 });
//                 p = q;
//                 p2 = q2;
//             }
//         }

//         result.add(new int[] { p, p2 });

//         return result.toArray(new int[result.size()][]);
//     }
// }

////////

// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {

//         List<int[]> result = new ArrayList<>();
//         int i = 0;
//         int n = intervals.length;

//         while(i<n) {
//             if(intervals[i][0] < newInterval[0]) {
//                 result.add(intervals[i])
//                 i++;
//             }
//         }

//         while(i < n && intervals[i][0] ) {
            
//         }

        
        
//         return result.toArray(new int[result.size()][]);
//     }
// }








class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Case 1: Add intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Case 2: Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // Add the merged newInterval
        result.add(newInterval);

        // Case 3: Add remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}