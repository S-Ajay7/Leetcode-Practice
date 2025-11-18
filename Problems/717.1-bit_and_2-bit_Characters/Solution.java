class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int ind = 0;
        while (ind < bits.length - 1) {
            if (bits[ind] == 0) {
                ind += 1;
            } else {
                ind += 2;
            }
        }
        return ind == bits.length - 1;
    }
}