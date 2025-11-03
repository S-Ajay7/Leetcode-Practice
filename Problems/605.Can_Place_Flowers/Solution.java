class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int k = 0;
        while (k < arr.length && n > 0) {
            if (arr[k] == 0) {
                int i = k - 1 >= 0 ? k - 1 : 0;
                int j = k + 1 < arr.length ? k + 1 : arr.length - 1;
                if (arr[i] == 0 && arr[j] == 0) {
                    arr[k] = 1;
                    k += 2;
                    n--;
                    continue;
                } else {
                    k++;
                }
            } else {
                k += 2;
            }
        }
        return n == 0;
    }
}