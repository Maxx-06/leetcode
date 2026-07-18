class Solution {
    public int removeDuplicates(int[] arr) {
        int l = 1;

        for(int i = 1;i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[l] = arr[i];
                l++;
            }
        }

        return l;

    }
}